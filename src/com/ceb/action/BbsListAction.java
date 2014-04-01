package com.ceb.action;

import java.util.List;
import java.util.Map;


import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.ceb.model.Bbs;
import com.opensymphony.xwork2.ActionSupport;
import com.ceb.service.BbsListService;
import com.ceb.service.*;

public class BbsListAction extends ActionSupport implements RequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private List<Bbs> bbss;
	private Bbs bbs;
	private int id;
	private int rootid;
	private int currentPage;
	
	

	private Map<String, Object> request;

	
	 

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<Bbs> getBbss() {
		return bbss;
	}

	public void setBbss(List<Bbs> bbss) {
		this.bbss = bbss;
	}

	public Bbs getBbs() {
		return bbs;
	}

	public void setBbs(Bbs bbs) {
		this.bbs = bbs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRootid() {
		return rootid;
	}

	public void setRootid(int rootid) {
		this.rootid = rootid;
	}
    
	


	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	
	public String listAll() throws Exception {
		BbsListService bbsListService = new BbsListService();
		int totalPage=bbsListService.getTotalPage();
	    
        request.put("totalPage", ""+totalPage);
	    //session.put("totalPage", "wenhui");
	    
	    bbss = bbsListService.listAll(currentPage);
	    return "listAll";
}
//	public String listAll() {
//		
//		bbss = bbsService.list("from Bbs where isleaf=0"); 
//		return "listAll";
//	}

	public String listDetail() throws Exception {
		BbsListService bbsListService = new BbsListService();
		int totalPage=bbsListService.getTotalPage(rootid);
		request.put("totalPage", ""+totalPage);
		bbss = bbsListService.listDetail(rootid,currentPage);
        
		return "listDetail";
	}
}
