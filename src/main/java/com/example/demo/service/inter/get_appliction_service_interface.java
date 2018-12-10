package com.example.demo.service.inter;

import java.util.Date;
import java.util.List;

import com.example.demo.entity.user_subscription;

public interface get_appliction_service_interface {
	
	List<user_subscription> get_app();
	List<user_subscription> get_new_app();
	List<user_subscription> get_loan_app();
	List<user_subscription> get_legal_app();
	List<user_subscription> get_Financial_app();

}
