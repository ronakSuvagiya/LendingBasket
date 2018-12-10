package com.example.demo.dio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.bank_master;

@Service
@Transactional
public class bank_dio {

	@Autowired
	EntityManager em;
	
	public List<bank_master> get_bank()
	{
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<bank_master> cq = cb.createQuery(bank_master.class);
		Root<bank_master> from = cq.from(bank_master.class);
		cq.select(from);
		
		return null;
	}
}
