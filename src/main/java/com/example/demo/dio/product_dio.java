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

import com.example.demo.dio.inter.product_dio_inter;
import com.example.demo.entity.category_master;
import com.example.demo.entity.product_master;


@Service
@Transactional
public class product_dio  implements product_dio_inter{

	@Autowired
	EntityManager em;

	@Override
	public List<category_master> getProduct() {
		CriteriaBuilder cb =em.getCriteriaBuilder();
		CriteriaQuery<category_master> cq = cb.createQuery(category_master.class);
		Root<category_master> from = cq.from(category_master.class);
		cq.select(from);
		product_master pm = em.find(product_master.class, 1);
		cq.where(cb.notEqual(from.get("ms"),pm));
		Query q = em.createQuery(cq);
		List<category_master> cm= q.getResultList();
		return cm;
	}


	@Override
	public int changeCharge(Integer catID, Long charge) {
	
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaUpdate<category_master> up = cb.createCriteriaUpdate(category_master.class);
		Root<category_master> from = up.from(category_master.class);
		up.set(from.get("charge"),charge);
		up.where(cb.equal(from.get("id"), catID));
		int i=em.createQuery(up).executeUpdate();
		return i;
	}

}
