package com.cg.service;

import java.util.List;


import com.cg.beans.Prod;

public interface ProdService {

	public List<Prod>getAllProduct();

	public Prod getById(int pid);
}
