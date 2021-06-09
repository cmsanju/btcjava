package com.voter;

import java.util.Scanner;

public class Test {
		public static void main(String[] args) throws ValidvoterException,InvalidVoterException
		{
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter age");
			
			int age = sc.nextInt();
			
			VoterValidater va = new VoterValidater();
			
			
				
				va.checkAge(age);
			
		}
}
