package com.example.demo.entity;


import java.util.Date;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class user_subscription {

	@Id
	private int id;
	
	private Long loan_Amount;

	@ManyToOne(targetEntity=user_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private user_master userMaster;
	
	@ManyToOne(targetEntity=category_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="category_id")
	private category_master cm;
	
	@ManyToOne(targetEntity=loan_subcategory.class,cascade=CascadeType.ALL)
	@JoinColumn(name="loan_subcategory_id")
	private loan_subcategory ls;
	
	@ManyToOne(targetEntity=bank_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="bank_id")
	private bank_master bankMaster;

	@ManyToOne(targetEntity=appliction_status.class,cascade=CascadeType.ALL)
	@JoinColumn(name="appliction_status")
	private appliction_status as;
	
	@Temporal(TemporalType.DATE)
	private Date create_on;
	
	private String create_by;
	
	@Temporal(TemporalType.DATE)
	private Date update_on;
	
	private String update_by;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getLoan_Amount() {
		return loan_Amount;
	}

	public void setLoan_Amount(Long loan_Amount) {
		this.loan_Amount = loan_Amount;
	}

	public user_master getUserMaster() {
		return userMaster;
	}

	public void setUserMaster(user_master userMaster) {
		this.userMaster = userMaster;
	}

	public category_master getCm() {
		return cm;
	}

	public void setCm(category_master cm) {
		this.cm = cm;
	}

	public loan_subcategory getLs() {
		return ls;
	}

	public void setLs(loan_subcategory ls) {
		this.ls = ls;
	}

	public bank_master getBankMaster() {
		return bankMaster;
	}

	public void setBankMaster(bank_master bankMaster) {
		this.bankMaster = bankMaster;
	}

	public appliction_status getAs() {
		return as;
	}

	public void setAs(appliction_status as) {
		this.as = as;
	}

	public Date getCreate_on() {
		return create_on;
	}

	public void setCreate_on(Date create_on) {
		this.create_on = create_on;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public Date getUpdate_on() {
		return update_on;
	}

	public void setUpdate_on(Date update_on) {
		this.update_on = update_on;
	}

	public String getUpdate_by() {
		return update_by;
	}

	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	
	
	
	
}
