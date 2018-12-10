package com.example.demo.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotNull;

@Entity
public class loan_subcategory {

	@Id
	private int id;
	
	@NotNull
	private String name;
	
	@ManyToOne(targetEntity=category_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="category_id")
	category_master cm;
	
	
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

	public category_master getCm() {
		return cm;
	}

	public void setCm(category_master cm) {
		this.cm = cm;
	}
	
	
}
