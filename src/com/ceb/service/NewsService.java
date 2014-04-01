package com.ceb.service;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ceb.dao.SessionManager;
import com.ceb.model.Bbs;
import com.ceb.model.News;

public class NewsService {
	
	Session session;
	public NewsService() {}
    
	 public void begin(){
    	 session=(Session) SessionManager.newInstance().getSession();
     }
    
    public void end(){
    	SessionManager.newInstance().closeSession();
    }
    
	
    public void add(News news){
    	begin();
		session.save(news);
		end();
    }
    
    public void delete(News news){
    	begin();
		session.delete(news);
		end();
    	
    }
    
    public void deleteById(int id) {
		begin();
		String hql="from News where id="+id;
       session.delete(this.findById(id));
		end();
		
	}
	
	public void update(News news) {
		begin();
		String hql="from News where id="+news.getId();
		session.update(news);
		end();
	}
	
	public News findById(int id) {
		begin();
		String hql="from News where id="+id;
		Query q = session.createQuery(hql);
		List<News> ql = (List<News>)q.list();
		end();
		return ql.get(0);
	}
	
	
	
	 
	public List<News> list(String hql) {
		begin();
	
		Query q = session.createQuery(hql);
		List<News> ql = (List<News>)q.list();
		end();
		return ql;
	}
	
	

}
