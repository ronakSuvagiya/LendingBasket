package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.get_appliction_activity;
import com.example.demo.entity.user_subscription;
import com.example.demo.service.inter.get_appliction_service_interface;

@Service
public class get_appliction_service implements get_appliction_service_interface{

	@Autowired
	get_appliction_activity appliction;
	
	@Override
	public List<user_subscription> get_app() {
		// TODO Auto-generated method stub
		return appliction.get_app();
	}

	@Override
	public List<user_subscription> get_new_app() {
		// TODO Auto-generated method stub
		return appliction.get_new_app();
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
