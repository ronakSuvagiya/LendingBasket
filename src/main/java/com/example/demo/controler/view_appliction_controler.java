package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.user_subscription;
import com.example.demo.service.get_appliction_service;

@Controller
public class view_appliction_controler {

	@Autowired
	get_appliction_service appliction;
	
	@RequestMapping("/viewAppliction")
	private ModelAndView viewAppliction()
	{
		ModelAndView model = new ModelAndView("viewAppliction");
		 List<user_subscription> user = appliction.get_app();
		 model.addObject("user",user);
		return model;
	}	
}
