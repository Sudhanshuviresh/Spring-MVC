package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Prod;
import com.cg.dao.ProdDao;

@Service
public class ProdServiceImpl implements ProdService {

	@Autowired
	ProdDao productDao;
	
	@Override
	public List<Prod> getAllProduct() {
		
		return productDao.retrieveAll();
	}

	@Override
	public Prod getById(int pid) {
		// TODO Auto-generated method stub
	return productDao.getById(pid);
	}

}
