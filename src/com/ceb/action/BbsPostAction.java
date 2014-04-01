package com.ceb.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;



import com.ceb.model.Bbs;
import com.ceb.service.BbsListService;
import com.ceb.service.BbsService;
import com.opensymphony.xwork2.ActionSupport;

public class BbsPostAction  extends ActionSupport implements RequestAware{

	private static final long serialVersionUID = 1L;
private Bbs bbs;
private int currentPage;

private Map<String, Object> request;

public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
private List<Bbs> bbss;

public List<Bbs> getBbss() {
	return bbss;
}
public void setBbss(List<Bbs> bbss) {
	this.bbss = bbss;
}
private BbsService bbsService = new BbsService();
private BbsListService bbsPage = new BbsListService();

public Bbs getBbs() {
	return bbs;
}
public void setBbs(Bbs bbs) {
	this.bbs = bbs;
}

public void setRequest(Map<String, Object> request) {
	this.request = request;
}

//public static Date getTime() {
//    Calendar nowTime= Calendar.getInstance();
//    Date nowDate = nowTime.getTime();
//    String dateFormat = "yyyy-MM-dd HH:mm:ss";
//    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
//    return new Date(sdf.format(nowDate));
//} 

@Override
public String execute() {
	try{
   // bbs.setPdate(getTime());
    bbs.setRootid(bbsService.getMaxId());	
    bbsService.add(bbs);
    bbss = bbsPage.listAll(currentPage);
	return "postSuccess";
	}
	
	catch(Exception e)
	     {
		return "error";
		}
	
	
}

public String goPost(){
//	int maxId = bbsService.getMaxId();
//	request.put("maxId", maxId);
	return "goPostSuccess";
	
	
}

}
