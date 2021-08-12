package com.test;

class TestBlocks
{
	//static block
	static
	{
		System.out.println("static block");
	}
	int x = 100;
	//instance block
	
	public TestBlocks()
	{
		System.out.println("constructor");
	}
	
	
	{
		System.out.println("instance block");
		
		
	}
	
	public void show()
	{
		System.out.println("show()");
	}
}


public class Exp16 
{
	public static void main(String[] args) {
		
		TestBlocks tb = new TestBlocks();
		
		tb.show();
		
		TestBlocks tb1 = new TestBlocks();
			
	}
}
