package com.ceb.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.struts2.ServletActionContext;

import com.ceb.model.Files;
import com.ceb.service.FilesService;
import com.opensymphony.xwork2.ActionSupport;

public class FilesAction extends ActionSupport {
	private File upFile;
	private String upFileFileName; // 上传的文件名 (1.系统自动注入 2.变量命名有规则: //
	// 前台对象名+"FileName")
	
	// 前台对象名+"ContentType")
	private String savePath;

	private Files files;
	private Files f = new Files();


	private int id_int;

	@Override
	public String execute() throws Exception {

		System.out.print(files.getId());
		f.setId(files.getId()+"01");
		
		f.setName(this.getUpFileFileName());
		
		f.setDescription(files.getDescription());
		
		f.setOwner(files.getOwner());
		f.setPath(this.getUpFileFileName());

		FilesService fs = new FilesService();
//		while (!fs.save(f)) {
//			id_int = Integer.parseInt(f.getId());
//			id_int++;
//			f.setId(String.valueOf(id_int));
//		}
		fs.save(f);
		
		String path = ServletActionContext.getServletContext().getRealPath(
				getSavePath())
				+ "/" + upFileFileName;

		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		System.out.print(path);
		try {
			bis = new BufferedInputStream(new FileInputStream(upFile));
			bos = new BufferedOutputStream(new FileOutputStream(path));
			byte[] buf = new byte[(int) upFile.length()];
			int len = 0;
			while (((len = bis.read(buf)) != -1)) {
				bos.write(buf, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
				if (bis != null) {
					bis.close();
				}
			} catch (Exception e) {
				bos = null;
				bis = null;
			}
		}
		return SUCCESS;
	}

	public File getUpFile() {
		return upFile;
	}

	public void setUpFile(File upFile) {
		this.upFile = upFile;
	}

	public String getUpFileFileName() {
		return upFileFileName;
	}

	public void setUpFileFileName(String upFileFileName) {
		this.upFileFileName = upFileFileName;
	}

	

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public Files getFiles() {
		return files;
	}

	public void setFiles(Files files) {
		this.files = files;
	}

	
}
