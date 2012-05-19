package com.manu.hibernate.mappings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.manu.hibernate.dao.GenDAO;

@Configurable(autowire = Autowire.BY_NAME) 
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DataSelectionsTest {
	
	@Autowired
	private GenDAO genDAO;
	
	@Test
	public void testSelectAll(){
		
		genDAO.selectAll();
		
	}
}
