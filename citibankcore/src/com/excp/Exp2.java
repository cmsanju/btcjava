package com.excp;

import java.util.Scanner;

/*
 * 1 try block
 * 2 catch block
 * 3 finally
 * 4 throws
 * 5 throw 
 */
public class Exp2 {
	
	public static void main(String[] args) {
		Scanner sc = null;
		try
		{
			System.out.println(12/6);
			
			String[] name = {"java", ".net"};
			
			System.out.println(name[0]);
			
			String str = "123";
			
			int x = Integer.parseInt(str);
			
			sc = new Scanner(System.in);
			
			String name1 = null;
			
					System.out.println(name1.charAt(11));
			
			//System.exit(0);
		}
		//System.out.println();
		
		catch(ArithmeticException ae)
		{
			System.out.println("Don't enter zero for den");
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("check your array size");
		}
		catch(NumberFormatException ime)
		{
			System.out.println("please enter numerical data");
		}
		
		catch(Exception e)
		{
			System.out.println("check your inputs");
		}
		//System.out.println("I am from here");
		finally
		{
			System.out.println("I am from finally");
			try
			{
				System.out.println(10/5);
				if(sc != null)
				{
					sc.close();
				}
			}
			catch(Exception e)
			{
				System.out.println("object not destroyed");
			}
		}
		
		System.out.println("java 12345");
	}

}
