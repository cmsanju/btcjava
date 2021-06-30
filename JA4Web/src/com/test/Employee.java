package com.test;

public class Employee extends Person
{
	
	private double salary;
	
	public Employee()
	{
		
	}

	public Employee(String name, int age, String address, int pincode, double salary) {
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
		this.setPincode(pincode);
		this.salary = salary;
	}
	
	public void employeeDetails()
	{
		System.out.println("Employee Details : \n Name : "+this.getName()+" \n Age : "+this.getAge()+" \n Address : "+this.getAddress()+" \n Pincode : "+this.getPincode()+" \n Salary : "+salary);
	}

}
