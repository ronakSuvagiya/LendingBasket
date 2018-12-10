package com.example.demo.repository.inter;

import java.util.List;

import com.example.demo.dto.returnMessageDto;
import com.example.demo.entity.document_master;

public interface document_repository_inter {

	List<document_master> get_document_name();
	
	int update_is_active(boolean docStatus, int docId);
	
	returnMessageDto insert_product_doc(Integer proID, Integer loanId , Integer docID);
}
