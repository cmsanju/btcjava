package com.vishnu;

interface Inf1
{
	int x = 123;
	
	void cat();
	
	default void human()
	{
		System.out.println("human()");
	}
	
	static void animal()
	{
		System.out.println("animal()");
	}
}

abstract class Abs
{
	public void movie()
	{
		System.out.println("movie");
	}
	
	public abstract void fox();
}

class Test extends Abs implements Inf1
{
	public void fox()
	{
		System.out.println("overrided abs");
	}
	
	public void cat()
	{
		System.out.println("overrided inf");
	}
}

public class Exp1 
{
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.cat();
		t.fox();
		t.human();
		t.movie();
		
		Inf1.animal();
	}
}
