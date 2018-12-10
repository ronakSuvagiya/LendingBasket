package com.example.demo.entity;




import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class bank_master {

	@Id
	private int id;
	
	private String name;
	
	private int file_charge;
	
	@ManyToOne(targetEntity= loan_subcategory.class,cascade=CascadeType.ALL)
	@JoinColumn(name="loan_subcategory_id")
	private loan_subcategory ls;
	
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

	public int getFile_charge() {
		return file_charge;
	}

	public void setFile_charge(int file_charge) {
		this.file_charge = file_charge;
	}


	
	
}
