package com.example.demo.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class city_master {

	@Id
	private int id;
	
	private String city_name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="state_id")
	private state_master state;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public state_master getState() {
		return state;
	}

	public void setState(state_master state) {
		this.state = state;
	}
	
	
}
