package com.test;

import java.util.Comparator;

public class Customer implements Comparable<Customer>
{
	
	private int id;
	private String name;
	private int year;
	
	public int compareTo(Customer obj)
	{
		return this.year - obj.year;
	}
	
	public Customer(int id, String name, int year)
	{
		this.id = id;
		this.name = name;
		this.year = year;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

}

class NameComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o2.getName().compareTo(o1.getName());
	}
	
}
