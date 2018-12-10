package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.get_user_details_service;

@Controller
public class user_details_controler {
	
	@Autowired
	get_user_details_service details_service;

	@RequestMapping("/viewUserDetails")
	private ModelAndView getUserDetails()
	{
		ModelAndView model = new ModelAndView("viewUserDetails");
		model.addObject("lists",details_service.getUserDetails());
		return model;
	}
	
}
