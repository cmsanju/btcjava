package com.test;

import java.util.Scanner;

public class Exp2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age");
		
		int x = sc.nextInt();
		
		if(x == 18)
		{
			System.out.println("age == 18");
		}
		else if(x > 18)
		{
			System.out.println("age > 18");
		}
		
		else
		{
			System.out.println("age < 18");
		}
		
		System.out.println(":::::::Candidate Details:::::");
		System.out.println("Your age : "+x);
		
	}

}
