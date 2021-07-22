package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction ts = session.beginTransaction();
		
		Employee eobj = new Employee();//transient state
		
		eobj.setEmp_name("Manohar");
		eobj.setEmp_salary("1234");
		
		session.persist(eobj);// persistence state
		
		ts.commit();
		
		session.close();// detached 
		
		System.out.println("Done.");
	}

}
