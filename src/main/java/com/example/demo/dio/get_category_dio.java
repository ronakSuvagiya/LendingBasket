package com.example.demo.dio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dio.inter.get_category_dio_interface;
import com.example.demo.entity.category_master;

@Service
@Transactional
public class get_category_dio implements get_category_dio_interface {

	@Autowired
	EntityManager em;
	
	public List<category_master> get_cat()
	{
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<category_master> cq = cb.createQuery(category_master.class);
		Root<category_master> from = cq.from(category_master.class);
		cq.select(from);
		Query q = em.createQuery(cq);
		return q.getResultList();
	}
}
