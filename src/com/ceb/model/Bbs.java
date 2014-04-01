package com.ceb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;

@Entity
public class Bbs {
	private int id;
	private String pname;
	private int rootid;
	private String title;
	private String cont;
	private Date pdate;
	private int isleaf;

	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getRootid() {
		return rootid;
	}
	public void setRootid(int rootid) {
		this.rootid = rootid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Lob//”≥…‰≥…text
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	//@Temporal(TemporalType.TIME)
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public int getIsleaf() {
		return isleaf;
	}
	public void setIsleaf(int isleaf) {
		this.isleaf = isleaf;
	}
	
	
	

}
