package com.example.demo.entity;




import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class user_subscription_doc {

	@Id
	private int id;
	
	@ManyToOne(targetEntity=user_subscription.class,cascade=CascadeType.ALL)
	@JoinColumn(name="user_sub_id")
	private user_subscription us;
	
	@NotNull
	private String photo_name;
	
	@NotNull
	private String pdf_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public user_subscription getUs() {
		return us;
	}

	public void setUs(user_subscription us) {
		this.us = us;
	}

	public String getPhoto_name() {
		return photo_name;
	}

	public void setPhoto_name(String photo_name) {
		this.photo_name = photo_name;
	}

	public String getPdf_name() {
		return pdf_name;
	}

	public void setPdf_name(String pdf_name) {
		this.pdf_name = pdf_name;
	}

	
}
