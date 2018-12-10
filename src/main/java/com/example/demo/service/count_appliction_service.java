package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.count_appliction_activity;
import com.example.demo.service.inter.count_appliction_service_interface;

@Service
public class count_appliction_service implements count_appliction_service_interface {

	@Autowired
	count_appliction_activity acAppliction_activity;
	
	public int count_totale_appliction()
	{
		return acAppliction_activity.count_totale_appliction();
	}
	
	public int count_new_appliction()
	{
		return acAppliction_activity.count_new_appliction();
	}
	
	public int count_pending_appliction()
	{
		return acAppliction_activity.count_pending_appliction();
	}
	
	public int count_close_appliction()
	{
		return acAppliction_activity.count_close_appliction();
	}
	
	public int count_inqiry()
	{
		return acAppliction_activity.count_inqiry();
	}
	
	public int loan_count()
	{
		return acAppliction_activity.loan_count();
	}
	public int legal_count()
	{
		return acAppliction_activity.legal_count();
	}
	public int financial_cont()
	{
		return acAppliction_activity.financial_cont();
	}
	
}
