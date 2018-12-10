package com.example.demo.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.inter.get_category_activity_interface;
import com.example.demo.entity.category_master;
import com.example.demo.repository.get_category_repository;

@Service
public class get_category_activity  implements get_category_activity_interface{

	@Autowired
	get_category_repository category_repository;

	@Override
	public List<category_master> get_cat() {
		// TODO Auto-generated method stub
		return category_repository.get_cat();
	}
	
	
}
