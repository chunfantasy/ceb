package cm.fredck.FCKeditor.uploader;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;

public class SimpleUploaderServlet extends HttpServlet {
	private static String baseDir;
	private static boolean debug = false;
	private static boolean enabled = false;
	private static Hashtable allowedExtensions;
	private static Hashtable deniedExtensions;

	public void init() throws ServletException {
		debug = new Boolean(getInitParameter("debug")).booleanValue();

		if (debug)
			System.out
					.println("\r\n---- SimpleUploaderServlet initialization started ----");

		baseDir = getInitParameter("baseDir");
		enabled = new Boolean(getInitParameter("enabled")).booleanValue();
		if (baseDir == null)
			baseDir = "/UserFiles/";
		String realBaseDir = getServletContext().getRealPath(baseDir);
		File baseFile = new File(realBaseDir);
		if (!(baseFile.exists())) {
			baseFile.mkdir();
		}

		allowedExtensions = new Hashtable(3);
		deniedExtensions = new Hashtable(3);

		allowedExtensions.put("File",
				stringToArrayList(getInitParameter("AllowedExtensionsFile")));
		deniedExtensions.put("File",
				stringToArrayList(getInitParameter("DeniedExtensionsFile")));

		allowedExtensions.put("Image",
				stringToArrayList(getInitParameter("AllowedExtensionsImage")));
		deniedExtensions.put("Image",
				stringToArrayList(getInitParameter("DeniedExtensionsImage")));

		allowedExtensions.put("Flash",
				stringToArrayList(getInitParameter("AllowedExtensionsFlash")));
		deniedExtensions.put("Flash",
				stringToArrayList(getInitParameter("DeniedExtensionsFlash")));

		if (debug)
			System.out
					.println("---- SimpleUploaderServlet initialization completed ----\r\n");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (debug)
			System.out.println("--- BEGIN DOPOST ---");

		response.setContentType("text/html; charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter out = response.getWriter();

		String typeStr = request.getParameter("Type");

		String currentPath = baseDir + typeStr;
		String currentDirPath = getServletContext().getRealPath(currentPath);
		currentPath = request.getContextPath() + currentPath;

		if (debug)
			System.out.println(currentDirPath);

		String retVal = "0";
		String newName = "";
		String fileUrl = "";
		String errorMessage = "";

		if (enabled) {
			DiskFileUpload upload = new DiskFileUpload();
			upload.setHeaderEncoding("UTF-8");//加入这段代码，解决中文乱码问题
			try {
				List items = upload.parseRequest(request);

				Map fields = new HashMap();

				Iterator iter = items.iterator();
				while (iter.hasNext()) {
					FileItem item = (FileItem) iter.next();
					if (item.isFormField())
						fields.put(item.getFieldName(), item.getString());
					else
						fields.put(item.getFieldName(), item);
				}
				FileItem uplFile = (FileItem) fields.get("NewFile");
				String fileNameLong = uplFile.getName();
				fileNameLong = fileNameLong.replace('\\', '/');
				String[] pathParts = fileNameLong.split("/");
				String fileName = pathParts[(pathParts.length - 1)];
				
				String nameWithoutExt = getNameWithoutExtension(fileName);
				String ext = getExtension(fileName);//获取上传文件后缀
				//Date dt = new Date(System.currentTimeMillis());
				//SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");
				//fileName = fmt.format(dt) + "." + ext; //取得新文件名
				File pathToSave = new File(currentDirPath, fileName);
				fileUrl = currentPath + "/" + fileName;
				if (extIsAllowed(typeStr, ext)) {
					int counter = 1;
					while (pathToSave.exists()) {
						newName = nameWithoutExt + "(" + counter + ")" + "."
								+ ext;
						//fileUrl = currentPath + "/" + newName;
						fileUrl = currentPath + "/" + nameWithoutExt;
						retVal = "201";
						pathToSave = new File(currentDirPath, newName);
						++counter;
					}
					uplFile.write(pathToSave);
				} else {
					retVal = "202";
					errorMessage = "";
					if (debug)
						System.out.println("Invalid file type: " + ext);
				}
			} catch (Exception ex) {
				if (debug)
					ex.printStackTrace();
				retVal = "203";
			}
		} else {
			retVal = "1";
			errorMessage = "This file uploader is disabled. Please check the WEB-INF/web.xml file";
		}

		out.println("<script type=\"text/javascript\">");
		out.println("window.parent.OnUploadCompleted(" + retVal + ",'"
				+ fileUrl + "','" + newName + "','" + errorMessage + "');");
		out.println("</script>");
		out.flush();
		out.close();

		if (debug)
			System.out.println("--- END DOPOST ---");
	}

	private static String getNameWithoutExtension(String fileName) {
		return fileName.substring(0, fileName.lastIndexOf("."));
	}

	private String getExtension(String fileName) {
		return fileName.substring(fileName.lastIndexOf(".") + 1);
	}

	private ArrayList stringToArrayList(String str) {
		int i;
		if (debug)
			System.out.println(str);
		String[] strArr = str.split("\\|");

		ArrayList tmp = new ArrayList();
		if (str.length() > 0)
			for (i = 0; i < strArr.length; ++i) {
				if (debug)
					System.out.println(i + " - " + strArr[i]);
				tmp.add(strArr[i].toLowerCase());
			}

		return tmp;
	}

	private boolean extIsAllowed(String fileType, String ext) {
		ext = ext.toLowerCase();

		ArrayList allowList = (ArrayList) allowedExtensions.get(fileType);
		ArrayList denyList = (ArrayList) deniedExtensions.get(fileType);

		if (allowList.size() == 0) {
			return (!(denyList.contains(ext)));
		}

		if (denyList.size() == 0) {
			return (allowList.contains(ext));
		}

		return false;
	}
}