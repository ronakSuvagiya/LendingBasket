package com.example.demo.entity;




import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class document_master {

	@Id
	private int id;

	private String name;
	
	private String description;
	
	private String url;
	
	@Column(name="is_active", columnDefinition="Boolean default true")
	private boolean is_active=true;
	
	public boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	
}

