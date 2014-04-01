package com.ceb.model;

import javax.persistence.*;

@Entity
public class Files {

	private String id;
	private String name;
	private String description;
	private String owner;
	private String path;


	

	public String getName() {
		return name;
	}
    
	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
