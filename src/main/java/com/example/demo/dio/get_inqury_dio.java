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

import com.example.demo.dio.inter.get_inqury_dio_interface;
import com.example.demo.entity.inquiry;

@Service
@Transactional
public class get_inqury_dio implements get_inqury_dio_interface{

	
	
	@Autowired
	EntityManager em;
	
	public List<inquiry> get_inqury()
	{
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<inquiry> cq = cb.createQuery(inquiry.class);
		Root<inquiry> from = cq.from(inquiry.class);
		cq.select(from);
		cq.where(cb.equal(from.get("is_read"), 1));
		Query q = em.createQuery(cq);
		return q.getResultList();
	}
}
