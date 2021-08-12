package com.excp;

public class Exp3 {
	
	public static void main(String[] args) {
		//how to deal with the unknown exceptions in java
		try {
			
			System.out.println(22/0);
			
			
		} catch (Exception e) 
		{
			//1 by using getMessage();
			
			System.out.println(e.getMessage());//only message
			
			//2 by printing exception class object
			System.out.println(e);//exception class name and message
			
			//3 by using printStackTrace()
			
			e.printStackTrace();
		}
	}

}
