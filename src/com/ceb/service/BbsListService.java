package com.ceb.service;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.ceb.dao.SessionManager;
import com.ceb.model.Bbs;

public class BbsListService { 
//	BbsListService bbsListService = new BbsListService();
//	Configuration cfg;
//	SessionFactory sf;
	Session session;
	
	int totalCount;//总记录数
	int totalPageCount;//总页数
	int pageSize=2;//每页显示几条记录
	int currentPage=0 ;
//	
//	public void begin(){
//		 cfg = new AnnotationConfiguration();
//		 sf = cfg.configure().buildSessionFactory();
//		 session = sf.openSession();
//		 session.beginTransaction();
//	}
//	public void end (){
//		
//		session.getTransaction().commit();
//		session.close();
//		sf.close();
//	}
	public void BbsListService(){
		 
	}
    
//	public void begin(){
//		
//		session = (Session)SessionFactoryUtil.inStance().openSession(); 
//	}
     
	 public int getTotalCount() { 
//		 begin();
		 session=(Session) SessionManager.newInstance().getSession();
		 Query q = session.createQuery("select count(*) from Bbs"); 
		 List cc = q.list(); 
		 Long num = (Long)cc.get(0);
		 totalCount = num.intValue();
//		 Integer a = (Integer) cc.get(0); 
//		 totalCount =  a.intValue(); 
//		 end();
		 SessionManager.newInstance().closeSession();
		 return totalCount;
		 
		 } 
	 
	 public int getTotalCount(int rootid) { 
	
//		begin();
		 session=(Session) SessionManager.newInstance().getSession();
		 Query q = session.createQuery("select count(*) from Bbs where rootid="+rootid); 
		 List cc = q.list(); 
		 
		 Long num = (Long)cc.get(0);
		 totalCount = num.intValue();
//		 Integer a = (Integer) cc.get(0); 
//		 totalCount =  a.intValue(); 
//		 end();
		 SessionManager.newInstance().closeSession();
		 return totalCount;
		 
		 } 

   public int getTotalPage() { 
    int totalCount = getTotalCount(); 
  
    // 得到页面总数 
    int totalPageCount = ((totalCount + pageSize) - 1) / pageSize;
  
    return totalPageCount; 
  } 
   
   public int getTotalPage(int rootid) { 
	    int totalCount = getTotalCount(rootid); 
	  
	    // 得到页面总数 
	    int totalPageCount = ((totalCount + pageSize) - 1) / pageSize;
	  
	    return totalPageCount; 
	  } 

   public List<Bbs> listAll(int currentPage) throws Exception { 
	   int totolPage = this.getTotalPage();
	   try { 
//			begin();
		   session=(Session) SessionManager.newInstance().getSession();
		   if (currentPage == 0) { 
			    currentPage = 1; 
			   } 
		   else if(currentPage>totolPage)
	       {
	    	currentPage = totolPage;
	       }
		   String hql= "from Bbs where isleaf=0" ;
		   Query queryObject = session.createQuery(hql); 
		   queryObject.setFirstResult((currentPage - 1) * pageSize); 
		   queryObject.setMaxResults(pageSize); 
           List<Bbs> bbs = queryObject.list();
//           end();
           SessionManager.newInstance().closeSession();
		    return bbs;
		    
		    
		
		  } catch (Exception re) { 
		   
		    throw re; 
		  } 
		 
  } 
   
 public List<Bbs> listDetail(int rootid,int currentPage) throws Exception { 
	 int totalPage = this.getTotalPage(rootid);
	   try { 
//			begin();
		   session=(Session) SessionManager.newInstance().getSession();
	    if (currentPage == 0) { 
		    currentPage = 1; 
		   } 
	    else if(currentPage>totalPage)
	       {
	    	currentPage = totalPage;
	       }
		   String hql="from Bbs where rootid = "+rootid; 
		   Query queryObject = session.createQuery(hql); 
		   queryObject.setFirstResult((currentPage - 1) * pageSize); 
		   queryObject.setMaxResults(pageSize); 
           
//		    return queryObject.list();
		      List<Bbs> bbs = queryObject.list();
//	           end();
		      SessionManager.newInstance().closeSession();
			    return bbs;
		
		  } catch (Exception re) { 
		   
		    throw re; 
		  } 
		 
  } 
 }