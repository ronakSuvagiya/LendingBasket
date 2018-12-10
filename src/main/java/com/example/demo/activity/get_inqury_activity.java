package com.example.demo.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.inter.get_inqury_activity_interface;
import com.example.demo.entity.inquiry;
import com.example.demo.repository.get_inqury_repository;


@Service
public class get_inqury_activity implements get_inqury_activity_interface{

	@Autowired
	get_inqury_repository inqury;
	
	@Override
	public List<inquiry> get_inqury() {
		// TODO Auto-generated method stub
		return inqury.get_inqury();
	}

}
