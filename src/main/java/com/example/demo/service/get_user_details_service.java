package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.get_user_details_activity;
import com.example.demo.entity.user_master;
import com.example.demo.service.inter.get_user_details_service_interface;

@Service
public class get_user_details_service implements get_user_details_service_interface {

	@Autowired
	get_user_details_activity details_activity;
	
	public List<user_master> getUserDetails()
	{
		return details_activity.getUserDetails();
	}
	
}
