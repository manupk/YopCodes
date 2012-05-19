package com.manu.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manu.hibernate.mappings.domain.AMain;
import com.manu.hibernate.mappings.domain.ASub1;
import com.manu.hibernate.mappings.domain.ASub2;
import com.manu.hibernate.mappings.domain.ASub3;
import com.manu.hibernate.mappings.domain.RefOnlyAMain;

@Repository
@Transactional
public class GenDAOImpl implements GenDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveAMain(AMain a) {
		sessionFactory.getCurrentSession().save(a);
	}
	
	@Override
	public void selectAll(){
		
		Session session =  sessionFactory.getCurrentSession();
		
		List<AMain> result1 = session.createQuery(" from AMain").list();
		System.out.println(result1);
		List<ASub1> result2 = session.createQuery(" from ASub1 ").list();
		System.out.println(result2);
		List<ASub2> result3 = session.createQuery(" from ASub2").list();
		System.out.println(result3);
		List<ASub3> result4 = session.createQuery(" from ASub3").list();
		System.out.println(result4);
		
	}
	
}
