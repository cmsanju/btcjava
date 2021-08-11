package com.test;

import java.util.ArrayList;
import java.util.Collections;



public class TestCustomer {
	
	public static void main(String[] args) {
		
		ArrayList<Customer> stdList = new ArrayList<>();
		
		stdList.add(new Customer(111, "varun", 2015));
		stdList.add(new Customer(222, "varun1", 2010));
		stdList.add(new Customer(333, "Hero", 2000));
		stdList.add(new Customer(444, "user", 2017));
		
		NameComparator objName = new NameComparator();
		
		Collections.sort(stdList, objName);
		
		for(Customer cst : stdList)
		{
			System.out.println(cst.getId()+" "+cst.getName()+" "+cst.getYear());
		}
		
		
	}

}
