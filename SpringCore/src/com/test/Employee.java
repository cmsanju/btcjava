package com.test;

public class Employee // BEAN MODEL ENTITY POJO
{
	
	int id;
	String name;
	String salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public void disp()
	{
		System.out.println("Emp Details : "+id+" "+name+" "+salary);
	}
}
