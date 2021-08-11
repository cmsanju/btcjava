package com.test;


class Parent //Object
{
	
	public void pen()//original method
	{
		System.out.println("red color pen");
	}
}

class Child1 extends Parent
{
	
	@Override
	public void pen()//overriding method
	{
		System.out.println("green color pen");
	}
	
}

class Child2 extends Parent
{
	@Override
	public void pen()//overriding method
	{
		System.out.println("blue color pen");
	}
}

public class Exp10 {
	
	public static void main(String[] args) {
		
		Child1 c = new Child1();
		
		c.pen();
		
		Child2 c2 = new Child2();
		c2.pen();
		
		Parent p = new Child1();
		
		p.pen();
	}

}
