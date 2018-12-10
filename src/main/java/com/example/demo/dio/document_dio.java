package com.example.demo.dio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.baseControler.returnMessageBaseControler;
import com.example.demo.dio.inter.document_dio_inter;
import com.example.demo.dto.returnMessageDto;
import com.example.demo.entity.category_master;
import com.example.demo.entity.document_master;
import com.example.demo.entity.loan_subcategory;
import com.example.demo.entity.product_document;

@Service
@Transactional
public class document_dio extends returnMessageBaseControler implements document_dio_inter {

	@Autowired 
	EntityManager em;
	
	@Override
	public List<document_master> get_document_name() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<document_master> cq = cb.createQuery(document_master.class);
		Root<document_master> from = cq.from(document_master.class);
		cq.select(from);
		Query q = em.createQuery(cq);
		return q.getResultList();
	}
	
	public int update_is_active(boolean docStatus, int docId)
	{
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaUpdate<document_master> cq = cb.createCriteriaUpdate(document_master.class);
		Root<document_master> form = cq.from(document_master.class);
		cq.set(form.get("is_active"), docStatus);
		cq.where(cb.equal(form.get("id"), docId+1));
		int i = em.createQuery(cq).executeUpdate();
		return i;
	}
	
	public returnMessageDto insert_product_doc(Integer proID, Integer loanId , Integer docID) 
	{
		product_document pm = new product_document();
		category_master cm = em.find(category_master.class, proID);
		document_master dm = em.find(document_master.class, docID);
		pm.setC_master(cm);
		pm.setD_master(dm);
		if(loanId == null){}
		else
		{
			loan_subcategory ls = em.find(loan_subcategory.class, loanId);
			pm.setLs(ls);
		}	
		returnMessageDto rm = new returnMessageDto();
		try {
			em.persist(pm);
			sucessMsg(1,"Insert Document Successfull", rm);
		} catch (Exception e) {
			// TODO: handle exception
			sucessMsg(0,e.getMessage(), rm);
		}
		return rm;
	}
}
