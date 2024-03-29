package com.ceb.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {

	private int id;
	private String name;
	private String password;
	private String academy;
	private String department;
	private String email;




	@Id
    @GeneratedValue
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getAcademy() {
		return academy;
	}


	public void setAcademy(String academy) {
		this.academy = academy;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	



}
