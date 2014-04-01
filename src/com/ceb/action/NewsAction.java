package com.ceb.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import com.ceb.model.News;

import com.ceb.service.NewsService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author WEN-HUI
 *
 */
public class NewsAction extends ActionSupport  implements SessionAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private List<News> newss;
	private NewsService newsService = new NewsService(); 
	private News news;
	private int id;
	

	
	
	public List<News> getNewss() {
		return newss;
	}

	public void setNewss(List<News> newss) {
		this.newss = newss;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String list() {
		newss = newsService.list("from News ");
		return "list";
	}
	
	public String listDetail() {
		news = newsService.findById(id);
		return "listDetail";
	}
	
	public String post(){
		try{
		newsService.add(news);
		return "postSuccess";}
		catch(Exception e){
			return ERROR;
		}
		
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

    
    
}

