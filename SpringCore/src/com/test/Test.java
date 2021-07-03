package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		
		// 1 BeanFactory 2 ApplicationContext  
		
		Resource rs = new ClassPathResource("applicationContext.xml");
		
		BeanFactory bn  = new XmlBeanFactory(rs);
		
		Employee emp = (Employee)bn.getBean("emp");
		
		emp.disp();
	}

}
