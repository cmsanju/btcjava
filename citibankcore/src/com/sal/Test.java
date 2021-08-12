package com.sal;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws PsalException, NsalException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter salary");
		
		double sal = sc.nextDouble();
		
		SalValidater sv = new SalValidater();
		
		sv.checkSal(sal);
	}

}

//
