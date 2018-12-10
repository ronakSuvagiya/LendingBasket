package com.example.demo.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.inter.get_user_details_activity_interface;
import com.example.demo.entity.user_master;
import com.example.demo.repository.get_user_details_repository;

@Service
public class get_user_details_activity implements get_user_details_activity_interface {

	
	@Autowired
	get_user_details_repository details_repository;
	
	public List<user_master> getUserDetails()
	{
		return details_repository.getUserDetails();
	}
	
}
