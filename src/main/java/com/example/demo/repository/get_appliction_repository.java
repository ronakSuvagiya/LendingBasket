package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dio.get_appliction_dio;
import com.example.demo.entity.user_subscription;
import com.example.demo.repository.inter.get_appliction_repository_interface;

@Repository
public class get_appliction_repository implements get_appliction_repository_interface{
	
	@Autowired
	get_appliction_dio appliction_dio;

	@Override
	public List<user_subscription> get_app() {
		// TODO Auto-generated method stub
		return appliction_dio.get_app();
	}

	@Override
	public List<user_subscription> get_new_app(Date d) {
		// TODO Auto-generated method stub
		return appliction_dio.get_new_app(d);
	}

	@Override
	public List<user_subscription> get_loan_app() {
		// TODO Auto-generated method stub
		return appliction_dio.get_loan_app();
	}

	@Override
	public List<user_subscription> get_legal_app() {
		// TODO Auto-generated method stub
		return appliction_dio.get_legal_app();
	}

	@Override
	public List<user_subscription> get_Financial_app() {
		// TODO Auto-generated method stub
		return appliction_dio.get_Financial_app();
	}
	
	

}
