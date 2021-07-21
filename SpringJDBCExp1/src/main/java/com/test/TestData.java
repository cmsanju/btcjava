package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestData {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmpDao edb = ctx.getBean("edao", EmpDao.class);
		
		
		Employee eobj = new Employee(13, "SaiPrasad", "CGI");
		
		//edb.save(eobj);
		
		edb.update(eobj);
		
		System.out.println("Save data");
	}

}
/*
 * 
 * 1 create the table 
 * 2 write the dao operations
 * 3 execute the logic
 */
