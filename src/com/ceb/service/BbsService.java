package com.ceb.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.ceb.dao.SessionManager;
import com.ceb.model.Bbs;

public class BbsService {
//	
//	Configuration cfg;
//	SessionFactory sf;
	Session session;

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
    public void begin(){
    	 session=(Session) SessionManager.newInstance().getSession();
     }
    
    public void end(){
    	SessionManager.newInstance().closeSession();
    }
    
	public void add(Bbs bbs) {
			begin();
			session.save(bbs);
			end();
		
	}
	

	
	public void delete(Bbs bbs) {
		deleteById(bbs.getId());
	}
	
	public void deleteById(int id) {
		begin();
		String hql="from bbs where id="+id;
//		session.delete(hql);
		end();
		
	}
	
	public void update(Bbs c) {
		begin();
		String hql="from bbs where id="+c.getId();
		session.update(c);
		end();
	}
	
	public Bbs findById(int id) {
		begin();
		String hql="from Bbs where id="+id;
		Query q = session.createQuery(hql);
		List<Bbs> ql = (List<Bbs>)q.list();
		end();
		return ql.get(0);
	}
	
	
	
	 
	public List<Bbs> list(String hql) {
		begin();
	
		Query q = session.createQuery(hql);
		List<Bbs> ql = (List<Bbs>)q.list();
		end();
		return ql;
	}
	
	public int getMaxId(){
		begin();
		Query q = session.createQuery("select max(rootid) from Bbs"); 
		 List cc = q.list(); 
		 
		 Integer num = (Integer)cc.get(0);
		 int maxId =  num.intValue()+1;
		 end();
		 return maxId;
		 
		
	}

}
