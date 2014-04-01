package com.ceb.action;

import java.util.List;

import com.ceb.model.Bbs;
import com.ceb.service.BbsService;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	private List<Bbs> bbss;
    
	public List<Bbs> getBbss() {
		return bbss;
	}

	public void setBbss(List<Bbs> bbss) {
		this.bbss = bbss;
	}

	BbsService bbsService = new  BbsService();
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try
		{String hql = "from Bbs where isleaf = 0  order by rootid asc";
		 bbss = (List<Bbs>) bbsService.list(hql);
		return SUCCESS;}
		catch(Exception e){
			return ERROR;
		}
	}
  
}
