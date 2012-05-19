package com.manu.hibernate.dao;

import org.hibernate.Session;

import com.manu.hibernate.mappings.domain.AMain;

public interface GenDAO {
	
	void selectAll();
	
	void saveAMain(AMain a);
}
