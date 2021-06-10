package com.excp;

public class Exp2 {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("hello");
			System.out.println(100/2);
			System.out.println("hello again");
			
			String name = "java";
			
			System.out.println(name.charAt(2));
			
			String str = "hello";
			
			System.out.println(str.charAt(1));
			
			int[] ar = {23,40,56,89};
			
			System.out.println(ar[3]);
			
			Class.forName("com.test.Exp1");
		}
		
		
		catch(ArithmeticException ae)
		{
			System.out.println("don't enter zero for den");
		}
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("check your name length");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("check your array size");
		}
		catch(NullPointerException npe)
		{
			System.out.println("don't give null values for string");
		}
		catch(ClassNotFoundException cfe)
		{
			System.out.println("the given class not found");
		}
		catch(Exception e)
		{
			System.out.println("check your inputs");
		}
		
		finally
		{
			System.out.println("i am from finally");
			
			//close the connectons
		}
	}

}
