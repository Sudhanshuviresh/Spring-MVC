package com.cg.dao;

import java.util.List;
import com.cg.beans.Prod;

public interface ProdDao {
	public List<Prod> retrieveAll();

	public Prod getById(int pid);
}
