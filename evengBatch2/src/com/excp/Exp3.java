package com.excp;

public class Exp3 {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("hello");
			
			System.out.println("hi");
			
			String name = null;
			
			System.out.println(name.charAt(34));
			
		}
		catch(Exception e)
		{
			//1 with  help of getMessage();
			System.out.println(e.getMessage());
			
			//2 printing exception class object
			System.out.println(e);
			
			//3 using printStackTrace() method
			
			e.printStackTrace();
		}
	}

}
