package com.example.demo.dio.inter;

import java.util.List;

import com.example.demo.entity.category_master;

public interface product_dio_inter {
		List<category_master> getProduct();
		int changeCharge(Integer catID, Long charge);
}
