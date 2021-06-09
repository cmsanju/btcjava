package com.empsal;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws PsalException, NsalException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter salary");
		
		double sal = sc.nextDouble();
		
		ValidateSal vs = new ValidateSal();
		
		vs.checkSalary(sal);
		
		
	}
}
