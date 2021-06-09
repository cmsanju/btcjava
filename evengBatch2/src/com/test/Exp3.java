package com.test;

public class Exp3 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("hELLO");
			
			System.out.println(100/2);
			
			System.out.println("World");
			
			int[] ar = {12,34,56,78};
			
			System.out.println(ar[3]);
			
			String name = "java";
			
			System.out.println(name.charAt(6));
			
			String city = "java";
			
			System.out.println(city.charAt(0));
		} 
		catch (Exception e) 
		{
			//type 1
			System.out.println(e.getMessage());
			
			//type 2
			System.err.println(e);
			
			//type 3
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
