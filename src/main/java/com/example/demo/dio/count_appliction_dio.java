package com.example.demo.dio;

import java.time.LocalDate;
import java.util.Date;

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

import com.example.demo.dio.inter.count_appliction_dio_interface;
import com.example.demo.entity.appliction_status;
import com.example.demo.entity.category_master;
import com.example.demo.entity.product_master;
import com.example.demo.entity.user_subscription;

@Service
@Transactional
public class count_appliction_dio implements count_appliction_dio_interface{

	@Autowired
	EntityManager en;
	

	
	public Object count_totale_appliction()
	{
		Query q = en.createQuery("select count(u.id) from user_subscription u");
		return q.getSingleResult();
	}
	
	public Object count_new_appliction()
	{
		

		Date d = java.sql.Date.valueOf(LocalDate.now());
		System.out.println("Current Date :" + LocalDate.now());
		System.out.println(d);
		
		CriteriaBuilder cn = en.getCriteriaBuilder();
		CriteriaQuery<Object> cq = cn.createQuery();
		Root<user_subscription> from = cq.from(user_subscription.class);
		cq.select(cn.count(from.get("id")));
		cq.where(cn.equal(from.get("create_on"), d));
		TypedQuery<Object> tq = en.createQuery(cq);
		return tq.getSingleResult();
	}
	
	public Object count_pending_appliction()
	{
		appliction_status as =en.find(appliction_status.class, 1);
		Query q = en.createQuery("select count(u.id) from user_subscription u where u.as = :a_status");
		q.setParameter("a_status", as);
		return q.getSingleResult();

	}
	
	public Object count_close_appliction()
	{
		appliction_status as =en.find(appliction_status.class, 6);
		Query q = en.createQuery("select count(u.id) from user_subscription u where u.as = :a_status");
		q.setParameter("a_status", as);
		return q.getSingleResult();
	}
	
	public Object count_inqiry()
	{
		Boolean i = false;
		Query q = en.createQuery("select count(i.id) from inquiry i where i.is_read = :read");
		q.setParameter("read", i);
		loan_count();
		return q.getSingleResult();
		
	}
	
	public Object loan_count()
	{
		
		CriteriaBuilder cib = en.getCriteriaBuilder();
		CriteriaQuery<Object> tp = cib.createQuery();
		Root<user_subscription> us = tp.from(user_subscription.class);
		CriteriaQuery<Object> select = tp.select(cib.count(us.get("id")));
		select.where(cib.isNotNull(us.get("ls")));
		TypedQuery<Object> typedQuery = en.createQuery(select);
		return typedQuery.getSingleResult();
		
	}
	
	public Object legal_count()
	{
		CriteriaBuilder cn = en.getCriteriaBuilder();
		CriteriaQuery<Object> cq = cn.createQuery();
		Root<user_subscription> root = cq.from(user_subscription.class);
		Path<Object> path = root.get("cm");
		cq.select(cn.count(root.get("id")));
		
		
		product_master pm = en.find(product_master.class,2);
		
		Subquery<category_master> sb = cq.subquery(category_master.class);
		Root<category_master> from = sb.from(category_master.class);
		sb.select(from.get("id"));
		sb.where(cn.equal(from.get("ms"),pm));
		
		cq.where(cn.in(path).value(sb));
		TypedQuery<Object> t = en.createQuery(cq);
		 return t.getSingleResult();
	}
	
	public Object financial_cont()
	{
			CriteriaBuilder cn = en.getCriteriaBuilder();
			CriteriaQuery<Object> cq = cn.createQuery();
			Root<user_subscription> root = cq.from(user_subscription.class);
			Path<Object> path = root.get("cm");
			cq.select(cn.count(root.get("id")));
			
			product_master pm = en.find(product_master.class,3);
			
			Subquery<category_master> sb = cq.subquery(category_master.class);
			Root<category_master> from = sb.from(category_master.class);
			sb.select(from.get("id"));
			sb.where(cn.equal(from.get("ms"),pm));
			
			cq.where(cn.in(path).value(sb));
			TypedQuery<Object> t = en.createQuery(cq);
			 return t.getSingleResult();
	}

	
	
}
