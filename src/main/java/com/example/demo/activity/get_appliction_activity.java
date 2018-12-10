package com.example.demo.activity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.inter.get_appliction_activity_interface;
import com.example.demo.entity.user_subscription;
import com.example.demo.repository.get_appliction_repository;

@Service
public class get_appliction_activity implements get_appliction_activity_interface{

	@Autowired
	get_appliction_repository appliction;
	
	public Date getdate()
	{
		LocalDate lc = LocalDate.now();
		Date d = java.sql.Date.valueOf(lc);
		return d;
	}
	
	@Override
	public List<user_subscription> get_app() {
		// TODO Auto-generated method stub
		return appliction.get_app();
	}

	@Override
	public List<user_subscription> get_new_app() {
		Date d = getdate();
		return appliction.get_new_app(d);
	}

	@Override
	public List<user_subscription> get_loan_app() {
		// TODO Auto-generated method stub
		return appliction.get_loan_app();
	}

	@Override
	public List<user_subscription> get_legal_app() {
		// TODO Auto-generated method stub
		return appliction.get_legal_app();
	}

	@Override
	public List<user_subscription> get_Financial_app() {
		// TODO Auto-generated method stub
		return appliction.get_Financial_app();
	}

}
