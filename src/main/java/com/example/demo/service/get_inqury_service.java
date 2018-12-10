package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.get_inqury_activity;
import com.example.demo.entity.inquiry;
import com.example.demo.service.inter.get_inqury_service_interface;

@Service
public class get_inqury_service implements get_inqury_service_interface{

	@Autowired 
	get_inqury_activity inqury;
	
	
	@Override
	public List<inquiry> get_inqury() {
		// TODO Auto-generated method stub
		return inqury.get_inqury();
	}

}
