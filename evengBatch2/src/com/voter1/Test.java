package com.voter1;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws ValidVoterException,InvalidVoterException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age");
		
		int age = sc.nextInt();
		
		AgeValidater av = new AgeValidater();
		
		av.checkAge(age);
	}

}
