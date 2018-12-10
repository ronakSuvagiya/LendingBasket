package com.example.demo.entity;



import javax.persistence.Entity;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

@Entity
public class product_master {

	
	@Id
	private int id;
	
	@NotNull
	private String name;
		
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


	
}
