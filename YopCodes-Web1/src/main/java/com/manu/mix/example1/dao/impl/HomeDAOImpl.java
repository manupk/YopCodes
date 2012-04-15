package com.manu.mix.example1.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manu.mix.example1.dao.HomeDAO;

@Repository
public class HomeDAOImpl implements HomeDAO {

	@Autowired
	private SessionFactory sessionFactory;

}
