package com.manu.hibernate.mappings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.manu.hibernate.mappings.domain.ASub2;
import com.manu.hibernate.mappings.domain.ASub3;

@Configurable(autowire = Autowire.BY_NAME) 
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class RelationsInsertTest {
	
	@Autowired
	private GenDAO genDAO;
	
	//@Test
	public void testInsert_A(){
		
		AMain a = new AMain("A");
		
		ASub1 as1 = new ASub1("ASUB1");
		as1.setParent(a);
		a.setOne2oneSubA1(as1);

		genDAO.saveAMain(a);
	}
	
	@Test
	public void testInsert_AFamily(){
		
		//Create the Parent Object.
		AMain a = new AMain("A");
		
		//One2One Child of AMain, with shared column in both table.
		ASub1 as1 = new ASub1("ASub - 1");
		as1.setParent(a);
		a.setOne2oneSubA1(as1);

		//One2Many Using set, with shared column in both table.
		/*	ASub2 as2a = new ASub2("Set - 1");
		ASub2 as2b = new ASub2("Set - 2");
		as2a.setParent(a);
		as2b.setParent(a);
		Set<ASub2> subSet = new HashSet<ASub2>();
		subSet.add(as2a);
		subSet.add(as2b);
		a.setSubSets(subSet);
		
		//One2Many using List, with shared column in both table.
		ASub3 as3a = new ASub3("List - 1");
		ASub3 as3b = new ASub3("List - 2");
		ASub3 as3c = new ASub3("List - 3");
		as3a.setParent(a);
		as3b.setParent(a);
		as3c.setParent(a);
		List<ASub3> subList = new ArrayList<ASub3>();
		subList.add(as3a);
		subList.add(as3b);
		subList.add(as3c);
		a.setSubList(subList);*/

		genDAO.saveAMain(a);
	}

}
