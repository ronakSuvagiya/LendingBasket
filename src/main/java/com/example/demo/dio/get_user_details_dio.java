package com.example.demo.dio;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dio.inter.get_user_details_dio_interface;
import com.example.demo.entity.user_master;

@Service
@Transactional
public class get_user_details_dio implements get_user_details_dio_interface {

	@Autowired
	EntityManager entityManager;
	
	public List<user_master> userDetails()
	{

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<user_master> cq = cb.createQuery(user_master.class);
		Root<user_master> from = cq.from(user_master.class);
		cq.select(from);	
		Query q = entityManager.createQuery(cq);
		List<user_master> user = q.getResultList();
		
		return user;
	}
}
