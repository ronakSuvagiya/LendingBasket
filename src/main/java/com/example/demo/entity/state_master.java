package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class state_master {

	@Id
	private int id;
	
	private String state_name;
	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

}
