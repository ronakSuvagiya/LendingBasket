package com.example.demo.repository.inter;

import java.util.List;

import com.example.demo.entity.category_master;

public interface product_repository_inter {
		List<category_master> getProduct();
		int changeCharge(Integer catID, Long charge);
}
