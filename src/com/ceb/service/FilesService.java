package com.ceb.service;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ceb.dao.SessionManager;
import com.ceb.model.Files;

public class FilesService {
	public FilesService() {

	}

	public void initialize() {
		Session session = (Session) SessionManager.newInstance().getSession();

		Query q = session.createQuery("from Files order by id asc");
		List<Files> ql = (List<Files>) q.list();

		int i = 0;
		for (Files n0 : ql) {
			ServletActionContext.getRequest().setAttribute(
					"files" + String.valueOf(i + 1), ql.get(i++));

		}
		ServletActionContext.getRequest().setAttribute("count_files", i);
	}

	public void save(Files f) {
		Session session = (Session) SessionManager.newInstance().getSession();

		Query q = session.createQuery("from Files order by id asc");
		List<Files> ql = (List<Files>) q.list();
		int id_int = Integer.valueOf(f.getId());
		while (id_int <= Integer.valueOf(ql.get(ql.size() - 1).getId())) {
			id_int++;
		}
		f.setId(String.valueOf(id_int));
		System.out.println(f.getId());

		 try {
		 session.beginTransaction();
		 session.save(f);
		 session.getTransaction().commit();
		 } catch (Exception e) {
		 }

	}

}
