package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dio.count_appliction_dio;
import com.example.demo.repository.inter.count_appliction_repository_interface;

@Repository
public class count_appliction_repository implements count_appliction_repository_interface {

	@Autowired
	count_appliction_dio appliction;
	
	
	public Object count_totale_appliction()
	{
		return appliction.count_totale_appliction();
	}
	
	public Object count_new_appliction()
	{
		return appliction.count_new_appliction();
	}
	
	public Object count_pending_appliction()
	{
		return appliction.count_pending_appliction();
	}
	
	public Object count_close_appliction()
	{
		return appliction.count_close_appliction();
	}
	
	public Object count_inqiry()
	{
		return appliction.count_inqiry();
	}
	
	public Object loan_count()
	{
		return appliction.loan_count();
	}
	
	public Object legal_count()
	{
		return appliction.legal_count();
	}
	
	public Object financial_cont()
	{
		return appliction.financial_cont();
	}
	
	
}
