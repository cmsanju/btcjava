package com.test;

public class Exp2 {
	
	public static void main(String[] args) {
		
		try
		{
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
		catch(ArithmeticException ae)
		{
			System.out.println("Don't enter zero for den");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("check your array size");
		}
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("check your name length");
		}
		catch(NullPointerException npe)
		{
			System.out.println("don't give the null values");
		}
		catch(Exception e)
		{
			System.out.println("CHECK YOUR INPUTS");
		}
		finally {
			System.out.println("i am from finally.");
		}
	}

}
