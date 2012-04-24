package com.manu.hibernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manu.hibernate.mappings.domain.AMain;

@Repository
@Transactional
public class GenDAOImpl implements GenDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveAMain(AMain a) {
		sessionFactory.getCurrentSession().save(a);
	}
	
	
	
}
