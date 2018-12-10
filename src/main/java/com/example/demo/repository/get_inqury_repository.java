package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dio.get_inqury_dio;
import com.example.demo.entity.inquiry;
import com.example.demo.repository.inter.get_inqury_repository_interface;

@Repository
public class get_inqury_repository implements get_inqury_repository_interface{

	@Autowired
	get_inqury_dio inqury;
	
	@Override
	public List<inquiry> get_inqury() {
		// TODO Auto-generated method stub
		return inqury.get_inqury();
	}

}
