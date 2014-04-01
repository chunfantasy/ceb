package com.ceb.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.ceb.model.*;
import com.ceb.service.BbsService;
public class BbsAction extends ActionSupport  implements SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private List<Bbs> bbss;
	private BbsService bbsService = new BbsService(); 
	private Bbs bbs;
	private int id;
	private int rootid;
	public int getRootid() {
		return rootid;
	}

	public void setRootid(int rootid) {
		this.rootid = rootid;
	}

	public List<Bbs> getBbss() {
		return bbss;
	}

	public void setBbss(List<Bbs> bbss) {
		this.bbss = bbss;
	}

	public BbsService getBbsService() {
		return bbsService;
	}

	public void setBbsService(BbsService bbsService) {
		this.bbsService = bbsService;
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
	
	public String list() {
		bbss = bbsService.list("from Bbs where isleaf=0");
		return SUCCESS;
	}
	
	public String listDetail() {
		bbss = bbsService.list("from Bbs where rootid="+rootid);
		return "list";
	}
	
	public String add() {
		bbsService.add(bbs);
		return "add";
	}
	public String update() {
		bbsService.update(bbs);
		return SUCCESS;
	}
	public String delete() {
		bbsService.deleteById(id);
		return SUCCESS;
	}
	public String addInput() {
		
		return INPUT;
	}
	public String updateInput() {
		this.bbs = this.bbsService.findById(id);
		return INPUT;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

    
    
}
