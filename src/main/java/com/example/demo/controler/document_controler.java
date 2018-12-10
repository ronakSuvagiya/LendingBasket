package com.example.demo.controler;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.returnMessageDto;
import com.example.demo.service.document_service;
import com.example.demo.service.get_category_service;
import com.example.demo.service.get_loan_category_service;


@Controller
public class document_controler {

	@Autowired
	document_service doc;
	
	@Autowired
	get_category_service get_cat;
	
	@Autowired
	get_loan_category_service get_loan_cat;
	
	
	@RequestMapping("/changeDocument")
	private ModelAndView ChangeProductCharge()
	{
		ModelAndView model = new ModelAndView("changeDocument");
		model.addObject("docId",doc.get_document_name());
		model.addObject("cat",get_cat.get_cat());
		model.addObject("loan_cat",get_loan_cat.get_cat());
		return model;
	}
	
	
	@RequestMapping(value="/newDocument" , method=RequestMethod.POST)
	private ModelAndView newDocument(@RequestParam("docName")String docName, @RequestParam("docDesc")String docDesc)
	{
		System.out.println(docName);
		System.out.println(docDesc);
		ModelAndView model = ChangeProductCharge();
		return model;
	}
	
	@RequestMapping(value="/modifyDoc" , method=RequestMethod.POST)
	private ModelAndView modifyDoc(@RequestParam("docId")Integer docId,@RequestParam("status")boolean docStatus)
	{		
	
		int i =doc.update_is_active(docStatus, docId);
		System.out.println(i);
		ModelAndView model = ChangeProductCharge();
		if(i==0)
			model.addObject("message", "e");
		else
			model.addObject("message", "s");
		
		return model;
	}
	
	@PostMapping(value="/modifyProDoc")
	private ModelAndView modifyProDoc(@RequestParam("proId")Integer proID, @RequestParam("ddlLoanCategory")Integer loanId, @RequestParam("docId")Integer docID)
	{
		returnMessageDto rm = doc.insert_product_doc(proID, loanId, docID);
		ModelAndView model = ChangeProductCharge();
		model.addObject("ProMessage",rm);
		return model;
	}
	
}
