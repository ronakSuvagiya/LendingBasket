package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class jantari_details {

	
	@Id
	private int id;
	
	private int rate;
	
	@ManyToOne(targetEntity=area_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="area_id")
	private area_master am;
	
	
	@ManyToOne(targetEntity=property_master.class,cascade=CascadeType.ALL)
	@JoinColumn(name="property_id")
	private property_master pm;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}


	public area_master getAm() {
		return am;
	}


	public void setAm(area_master am) {
		this.am = am;
	}


	public property_master getPm() {
		return pm;
	}


	public void setPm(property_master pm) {
		this.pm = pm;
	}	

}
