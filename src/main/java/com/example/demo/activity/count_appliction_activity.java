package com.example.demo.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.inter.count_appliction_activity_interface;
import com.example.demo.repository.count_appliction_repository;

@Service
public class count_appliction_activity implements count_appliction_activity_interface{

	@Autowired
	count_appliction_repository appliction_repository;
	
	public int count_totale_appliction()
	{
		return Integer.parseInt(appliction_repository.count_totale_appliction().toString());
	}
	
	public int count_new_appliction()
	{
		return Integer.parseInt(appliction_repository.count_new_appliction().toString());
	}
	
	public int count_pending_appliction()
	{
		return Integer.parseInt(appliction_repository.count_pending_appliction().toString());
	}
	
	public int count_close_appliction()
	{
		return Integer.parseInt(appliction_repository.count_close_appliction().toString());
	}
	
	public int count_inqiry()
	{
		return Integer.parseInt(appliction_repository.count_inqiry().toString());
	}
	
	public int loan_count()
	{
		return Integer.parseInt(appliction_repository.loan_count().toString());
	}
	
	public int legal_count()
	{
		return Integer.parseInt(appliction_repository.legal_count().toString());
	}
	public int financial_cont()
	{
		return Integer.parseInt(appliction_repository.financial_cont().toString());
	}
	
	
	
}
