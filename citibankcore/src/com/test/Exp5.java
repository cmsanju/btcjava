package com.test;

class A
{
	int id = 11;
	String name = "Citi";
	String city = "Blr";
	
	public A()
	{
		System.out.println("defaul of parent");
	}
	
	public void disp()
	{
		System.out.println(id+" "+name+" "+city);
	}
}

class B extends A
{
	String cmp = "BankCiti";
	
	public B()
	{
		System.out.println("default of Child");
	}
	
	public void show()
	{
		System.out.println(id+" "+name+" "+city+" "+cmp);
	}
}

public class Exp5 {
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.disp();
		b.show();
	}

}
