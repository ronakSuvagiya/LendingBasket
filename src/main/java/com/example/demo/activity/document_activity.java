package com.example.demo.activity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.activity.inter.document_activity_inter;
import com.example.demo.dto.returnMessageDto;
import com.example.demo.entity.document_master;
import com.example.demo.repository.document_repository;

@Service
public class document_activity implements document_activity_inter{

	@Autowired
	document_repository Document;
	
	
	@Override
	public List<document_master> get_document_name() {
		// TODO Auto-generated method stub
		return Document.get_document_name();
	}


	@Override
	public int update_is_active(boolean docStatus, int docId) {
		
		return Document.update_is_active(docStatus, docId);
	}


	@Override
	public returnMessageDto insert_product_doc(Integer proID, Integer loanId, Integer docID) {
		// TODO Auto-generated method stub
		return Document.insert_product_doc(proID, loanId, docID);
	}

}
