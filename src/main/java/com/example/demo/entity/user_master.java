package com.example.demo.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class user_master {

	@Id
	private int id;
	
	private String first_name;
	
	private String last_name;
	
	private Long mobile;
	
	private String email;
	
	private String password;
	
	@OneToOne(targetEntity = state_master.class)
	@JoinColumn(name="state_id")
	private state_master st;
	
	
	@OneToOne(targetEntity = city_master.class)
	@JoinColumn(name="city_id")
	private city_master ct;
	
	private String adderss;
	
	private Date dob;
	
	private int Type;

	private String create_by;

	@Temporal(TemporalType.DATE)
	private Date create_on;
	
	@Temporal(TemporalType.DATE)
	private Date update_on;
	
	private String update_by;
	
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public state_master getSt() {
		return st;
	}
	public void setSt(state_master st) {
		this.st = st;
	}
	public city_master getCt() {
		return ct;
	}
	public void setCt(city_master ct) {
		this.ct = ct;
	}
	public String getAdderss() {
		return adderss;
	}
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getCreate_on() {
		return create_on;
	}
	public void setCreate_on(Date create_on) {
		this.create_on = create_on;
	}
	public Date getUpdate_on() {
		return update_on;
	}
	public void setUpdate_on(Date update_on) {
		this.update_on = update_on;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	
	
}
