package com.voter;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws ValidvoterException,InvalidVoterException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age");
		
		int age = sc.nextInt();
		
		AgeValidater av = new AgeValidater();
		
		
		av.checkAge(age);
		
		
		
	}

}
