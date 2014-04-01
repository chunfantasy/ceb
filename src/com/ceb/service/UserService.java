package com.ceb.service;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ceb.dao.SessionManager;
import com.ceb.model.Member;

public class UserService {
	

	
	public UserService(){
		
	}
	
	public boolean loginConfirm(String name, String password){
		Session session=(Session) SessionManager.newInstance().getSession();
		Query q = session.createQuery("from Member where name = '" + name
				+ "' and password = '" + password + "'");
		List<Member> ql = (List<Member>) q.list();
		if (ql.size() == 0)
			return false;
		else{
			
			ServletActionContext.getRequest().getSession().setAttribute("user", ql.get(0).getName());
			
			return true;}
	}
	
	public boolean save(Member m){
		Session session=(Session) SessionManager.newInstance().getSession();
		Query q = session.createQuery("from Member where  name="+"'"+m.getName()+"'");
		List<Member> ql = (List<Member>) q.list();
		
		if(ql.isEmpty()){
			session.save(m);
			
			return true;}
		else
            return false;

	
		
	}


}
