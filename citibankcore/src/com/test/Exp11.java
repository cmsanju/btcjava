package com.test;

interface Inf
{
	double pi = 3.14;
	
	void cat();
	//void add();
}

abstract class Abs
{
	public abstract void dog();
	//public abstract void message();
	
	public void show()
	{
		System.out.println("default method from abs");
	}
	
	//Abs a = new Abs();
}

class Impl extends Abs implements Inf
{
	@Override
	public void cat()
	{
		System.out.println("inf overriding");
	}
	
	public void dog()
	{
		System.out.println("ABS overriging");
	}
	
}

public class Exp11 {
	
	public static void main(String[] args) {
		
		Impl i = new Impl();
		
		i.cat();
		i.dog();
		i.show();
		
		Abs a = new Impl();
		
		a.show();
	}

}
