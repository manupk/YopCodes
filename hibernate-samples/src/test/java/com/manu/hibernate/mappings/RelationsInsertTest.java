package com.manu.hibernate.mappings;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.manu.hibernate.dao.GenDAO;
import com.manu.hibernate.mappings.domain.AMain;
import com.manu.hibernate.mappings.domain.ASub1;

@Configurable(autowire = Autowire.BY_NAME) 
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class RelationsInsertTest {
	
	@Autowired
	private GenDAO genDAO;
	
	@Test
	public void testinsert_A(){
		
		AMain a = new AMain("A");
		
		ASub1 as1 = new ASub1("ASUB1");
		as1.setParent(a);
		a.setOne2oneSubA1(as1);
		
		genDAO.saveAMain(a);
	}
}
