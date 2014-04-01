package com.ceb.action;


import com.ceb.model.Bbs;
import com.ceb.service.BbsListService;
import com.ceb.service.BbsService;
import com.ceb.service.*;
import com.opensymphony.xwork2.ActionSupport;


import java.util.List;

public class BbsReplyAction  extends ActionSupport{

private static final long serialVersionUID = 1L;
private Bbs bbs;
private List<Bbs> bbss;
private int currentPage;



public List<Bbs> getBbss() {
	return bbss;
}
public void setBbss(List<Bbs> bbss) {
	this.bbss = bbss;
}
public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}



public Bbs getBbs() {
	return bbs;
} 
public void setBbs(Bbs bbs) {
	this.bbs = bbs;
}

public String execute() throws Exception {
	
//    String hql= "from Bbs where isleaf=0" ;
	new BbsService().add(bbs);
    bbss =new BbsListService().listAll( currentPage);
    return "replySuccess";
}




}
