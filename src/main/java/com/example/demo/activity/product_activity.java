package com.example.demo.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.inter.product_activity_inter;
import com.example.demo.entity.category_master;
import com.example.demo.repository.product_repository;

@Service
public class product_activity implements product_activity_inter{

	@Autowired
	product_repository product;
	
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
