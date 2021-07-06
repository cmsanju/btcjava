package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmpDao edao = (EmpDao)ctx.getBean("edao");
		
		int x = edao.update(new Employee(102, "Akhil", "1234"));
		
		System.out.println("Successfully saved : "+1+" records");
	}

}
