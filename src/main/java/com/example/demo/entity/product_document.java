package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class product_document {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	
	@ManyToOne(targetEntity=category_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="category_id")
	private category_master c_master;
	
	@ManyToOne(targetEntity=document_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="doc_id")
	private document_master d_master;

	@ManyToOne(targetEntity=loan_subcategory.class,cascade=CascadeType.ALL)
	@JoinColumn(name="loan_subcategory_id")
	private loan_subcategory ls;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public category_master getC_master() {
		return c_master;
	}

	public void setC_master(category_master c_master) {
		this.c_master = c_master;
	}

	public loan_subcategory getLs() {
		return ls;
	}

	public void setLs(loan_subcategory ls) {
		this.ls = ls;
	}

	public document_master getD_master() {
		return d_master;
	}

	public void setD_master(document_master d_master) {
		this.d_master = d_master;
	}
	
	
	
}
