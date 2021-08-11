package com.test;

public class Exp14 {
	
	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		String str3 = "hello";
		
		System.out.println(str1+str2);
		
		String str4 = new String("java");
		String str5 = new String("java");
		String str6 = new String("hello");
		
		System.out.println(str1 == str2);
		
		System.out.println(str1 == str4);
		
		System.out.println(str1.equals(str4));
		
		System.out.println(str4==str5);
		System.out.println(str5.hashCode());
		
		StringBuffer sb = new StringBuffer(str1);
		
		System.out.println(sb.reverse());
		
		StringBuffer sb1 = new StringBuffer("Spring");
		
		System.out.println(sb1);
		
		sb1.append(" 5 version");
		
		System.out.println(sb1);
		
	}

}
