package com.test;

interface Inf1
{
	void add();
	
	interface Inf2
	{
		void sub();
	}
}

class Impl1 implements Inf1.Inf2
{
	@Override
	public void sub()
	{
		System.out.println("sub()");
	}
	public void show()
	{
		
	}
}

public class Exp12 {
	
	public static void main(String[] args) {
		
		Impl1 i = new Impl1();
		
		i.sub();
		
	}

}
