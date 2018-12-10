package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dio.document_dio;
import com.example.demo.dto.returnMessageDto;
import com.example.demo.entity.document_master;
import com.example.demo.repository.inter.document_repository_inter;

@Repository
public class document_repository implements document_repository_inter{

	@Autowired
	document_dio Document;
	
	
	@Override
	public List<document_master> get_document_name() {
		
		return Document.get_document_name();
	}


	@Override
	public int update_is_active(boolean docStatus, int docId) {
		// TODO Auto-generated method stub
		return Document.update_is_active(docStatus, docId);
	}


	@Override
	public returnMessageDto insert_product_doc(Integer proID, Integer loanId, Integer docID) {
		// TODO Auto-generated method stub
		return Document.insert_product_doc(proID, loanId, docID);
	}

}
