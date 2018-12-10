package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dio.get_category_dio;
import com.example.demo.entity.category_master;
import com.example.demo.repository.inter.get_category_repository_interface;

@Repository
public class get_category_repository implements get_category_repository_interface {

	@Autowired
	get_category_dio category_dio;

	@Override
	public List<category_master> get_cat() {
		// TODO Auto-generated method stub
		return category_dio.get_cat();
	}
	
	
}
