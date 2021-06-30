package com.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name ");
		
		String name = sc.nextLine();
		
		System.out.println("Enter age");
		
		int age = sc.nextInt();
		
		System.out.println("Enter address");
		
		 sc.nextLine();
		
		String address = sc.nextLine();
		
		System.out.println("Enter pincode");
		
		int pincode = sc.nextInt();
		
		System.out.println("Enter salary");
		
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(name,age,address,pincode,salary);
		
		
		System.out.println("======::Employee Details::=====");
		
		emp.employeeDetails();
		
		System.out.println("===========================");

	}

}
