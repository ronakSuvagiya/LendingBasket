package com.example.demo.controler;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dio.count_appliction_dio;
import com.example.demo.dio.get_appliction_dio;
import com.example.demo.dio.get_inqury_dio;
import com.example.demo.entity.inquiry;
import com.example.demo.entity.user_subscription;
import com.example.demo.service.count_appliction_service;
import com.example.demo.service.get_appliction_service;
import com.example.demo.service.get_inqury_service;
import com.example.demo.service.get_user_details_service;

@Controller
public class index_controler {

	
	
	@Autowired
	count_appliction_service app_service;
	
	@Autowired
	get_appliction_service appliction;
	
	@Autowired
	get_inqury_service inqury;
	

	
	@RequestMapping("/")
	private ModelAndView index()
	{
		int total_app = app_service.count_totale_appliction();
		int new_app = app_service.count_new_appliction();
		int pendding_app = app_service.count_pending_appliction();
		int close_app = app_service.count_close_appliction();
		int inqiry = app_service.count_inqiry();
		int loan = app_service.loan_count();
		int legal = app_service.legal_count();
		int financial = app_service.financial_cont();
		
		List<user_subscription> app = appliction.get_new_app();
		List<user_subscription> loan_app = appliction.get_loan_app();
		List<user_subscription> legal_app = appliction.get_legal_app();
		List<user_subscription> financial_app = appliction.get_Financial_app();
		List<inquiry> inquriry = inqury.get_inqury();
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("total_app", total_app);
		model.addObject("new_app", new_app);
		model.addObject("pendding_app", pendding_app);
		model.addObject("close_app", close_app);
		model.addObject("inqiry", inqiry);
		model.addObject("loan", loan);
		model.addObject("financial", financial);
		model.addObject("legal", legal);
		model.addObject("app", app);
		model.addObject("loan_app", loan_app);
		model.addObject("legal_app", legal_app);
		model.addObject("financial_app", financial_app);
		model.addObject("inquriry", inquriry);
		return model;
	}
	
	@RequestMapping("/index")
	private ModelAndView indexPage()
	{
		 return index();
	}
	
	@RequestMapping("/i")
	private ModelAndView test()
	{
		ModelAndView model = new ModelAndView("details");
	//	model.addObject("lists", co.loan_count());
		return model;
	}
	
	@RequestMapping("/ChangeApplictionStatus")
	private ModelAndView ChangeApplictionStatus()
	{
		ModelAndView model = new ModelAndView("ChangeApplictionStatus");
		return model;
	}
	
	
	@RequestMapping("/sendingMail")
	private ModelAndView sendingMail()
	{
		ModelAndView model = new ModelAndView("sendingMail");
		return model;
	}
	
	
	@RequestMapping("/addbank")
	private ModelAndView addbank()
	{
		ModelAndView model = new ModelAndView("addbank");
		return model;
	}
	
	
}
