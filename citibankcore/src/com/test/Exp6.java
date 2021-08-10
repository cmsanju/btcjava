package com.test;


class C 
{
	static int pin = 111;
	
	public void cat()
	{
		System.out.println("cat()"+pin);
	}
	
	public static void disp()
	{
		System.out.println("disp()");
	}
	
	public static void main(String[] args) {
		
		System.out.println(args[0]);
	}
}

class D extends C
{
	public void dog()
	{
		System.out.println("dog()");
	}
}

class E extends D
{
	public void human()
	{
		System.out.println("human()"+pin);
	}
}

public class Exp6 {
	
	public static void main(String[] args) {
		
		E e = new E();
		
		e.cat();
		e.dog();
		e.human();
		C.disp();
		
		String[] ar = {"java", "java", "java"};
		C c = new C();
		c.main(ar);
		System.out.println(C.pin);
	}

}
