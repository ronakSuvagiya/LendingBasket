package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dio.get_user_details_dio;
import com.example.demo.entity.user_master;
import com.example.demo.repository.inter.get_user_details_repository_interface;

@Repository
public class get_user_details_repository implements get_user_details_repository_interface{

	@Autowired
	get_user_details_dio details_dio;
	
	public List<user_master> getUserDetails()
	{
		return details_dio.userDetails();
	}

	
}
