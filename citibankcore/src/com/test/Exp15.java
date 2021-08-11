package com.test;

public class Exp15 {
	
	public static void main(String[] args) {
		
		String str = "citibank";
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
		
		System.out.println("\n"+str.length());
		
		String str1 = null;
		
		//System.out.println(str1.equals("admin"));
		
		String val1 = "456";
		String val2 = "89";
		
		System.out.println(val1+val2);
		
		int x = Integer.parseInt(val1);
		int y = Integer.parseInt(val2);
		
		System.out.println(x+y);
		
		Exp15 e = new Exp15();
		
		//e.clone();
				
		
		//int y = Integer.parseInt(str);
	}

}
