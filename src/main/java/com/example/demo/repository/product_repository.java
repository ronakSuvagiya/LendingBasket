package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dio.product_dio;
import com.example.demo.entity.category_master;
import com.example.demo.repository.inter.product_repository_inter;

@Repository
public class product_repository implements product_repository_inter{

	@Autowired
	product_dio product;
	@Override
	public List<category_master> getProduct() {
		// TODO Auto-generated method stub
		return product.getProduct();
	}
	@Override
	public int changeCharge(Integer catID, Long charge) {
		return product.changeCharge(catID, charge);
	}	
}
