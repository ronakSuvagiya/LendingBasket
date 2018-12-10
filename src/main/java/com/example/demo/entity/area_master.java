package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class area_master {

	@Id
	private int id;
	
	private String area_name;
	
	@ManyToOne(targetEntity = city_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="city_id")
	private city_master cs;
	
	
	@ManyToOne(targetEntity= state_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="state_id")
	private state_master sm;

	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getArea_name() {
		return area_name;
	}


	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}


	public city_master getCs() {
		return cs;
	}


	public void setCs(city_master cs) {
		this.cs = cs;
	}


	public state_master getSm() {
		return sm;
	}


	public void setSm(state_master sm) {
		this.sm = sm;
	}
	
	
	
}
