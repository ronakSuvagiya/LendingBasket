package com.example.demo.dio;


import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;

import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dio.inter.get_appliction_dio_interface;
import com.example.demo.entity.category_master;
import com.example.demo.entity.product_master;
import com.example.demo.entity.user_subscription;

@Service
@Transactional
public class get_appliction_dio implements get_appliction_dio_interface{

	@Autowired
	EntityManager em;
	
	
	public List<user_subscription> get_app()
	{
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<user_subscription> cq = cb.createQuery(user_subscription.class);
		Root<user_subscription> from = cq.from(user_subscription.class);
		cq.select(from);
	    Query q= em.createQuery(cq);
	    List<user_subscription> appliction = q.getResultList();
	    return appliction;
	}
	
	
	public List<user_subscription> get_new_app(Date d)
	{
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<user_subscription> cq = cb.createQuery(user_subscription.class);
		Root<user_subscription> from = cq.from(user_subscription.class);
		cq.select(from);
		cq.where(cb.equal(from.get("create_on"),d));
	    Query q= em.createQuery(cq);
	    List<user_subscription> appliction = q.getResultList();
	    return appliction;
	}
	
	
	public List<user_subscription> get_loan_app()
	{
		CriteriaBuilder cib = em.getCriteriaBuilder();
		CriteriaQuery<user_subscription> cq = cib.createQuery(user_subscription.class);
		Root<user_subscription> us = cq.from(user_subscription.class);
		cq.select(us);
		cq.where(cib.isNotNull(us.get("ls")));
	    Query q= em.createQuery(cq);
	    List<user_subscription> appliction = q.getResultList();
	    return appliction;
		
	}


	@Override
	public List<user_subscription> get_legal_app() {
		// TODO Auto-generated method stub
		
		
		
		CriteriaBuilder cn = em.getCriteriaBuilder();
		CriteriaQuery<Object> cq = cn.createQuery();
		Root<user_subscription> root = cq.from(user_subscription.class);
		Path<Object> path = root.get("cm");
		cq.select(root);
		
		
		product_master pm = em.find(product_master.class,2);
		
		Subquery<category_master> sb = cq.subquery(category_master.class);
		Root<category_master> from = sb.from(category_master.class);
		sb.select(from.get("id"));
		sb.where(cn.equal(from.get("ms"),pm));
		
		cq.where(cn.in(path).value(sb));
		Query query = em.createQuery(cq).setMaxResults(6);
		return query.getResultList();
	}


	@Override
	public List<user_subscription> get_Financial_app() {
		// TODO Auto-generated method stub
		CriteriaBuilder cn = em.getCriteriaBuilder();
		CriteriaQuery<Object> cq = cn.createQuery();
		Root<user_subscription> root = cq.from(user_subscription.class);
		Path<Object> path = root.get("cm");
		cq.select(root);
		
		
		product_master pm = em.find(product_master.class,3);
		
		Subquery<category_master> sb = cq.subquery(category_master.class);
		Root<category_master> from = sb.from(category_master.class);
		sb.select(from.get("id"));
		sb.where(cn.equal(from.get("ms"),pm));
		
		cq.where(cn.in(path).value(sb));
		Query query = em.createQuery(cq).setMaxResults(6);
		return query.getResultList();
	}
	
}
