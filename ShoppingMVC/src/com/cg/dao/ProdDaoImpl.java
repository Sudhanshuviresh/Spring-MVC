package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.beans.Prod;

@Repository
public class ProdDaoImpl implements ProdDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Prod> retrieveAll() {
		TypedQuery<Prod> query=entityManager.createQuery("from Product",Prod.class);
		List<Prod> productlist=query.getResultList();
		return productlist;
	}

	@Override
	public Prod getById(int pid) {
		
		return entityManager.find(Prod.class,pid);
	}

	

}
