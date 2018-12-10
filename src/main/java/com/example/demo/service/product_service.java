package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.product_activity;
import com.example.demo.entity.category_master;
import com.example.demo.service.inter.product_service_inter;

@Service
public class product_service implements product_service_inter{

	@Autowired
	product_activity product;
	
	
	@Override
	public List<category_master> getProduct() {
		return product.getProduct();
	}


	@Override
	public int changeCharge(Integer catID, Long charge) {
		// TODO Auto-generated method stub
		return product.changeCharge(catID, charge);
	}

}
