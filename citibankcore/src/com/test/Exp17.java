package com.test;

class OuterTest
{
	public static class InnerTest
	{
		 int x = 234;
		
		public void cat()
		{
			System.out.println("cat()"+x);
		}
		
		public static void main(String[] args) {
			
			OuterTest ot = new OuterTest();
			
			//ot.cat();
			
			OuterTest.InnerTest obj = new OuterTest.InnerTest();
			
			obj.cat();
			
			
		}
	}
	
	public static void main(String[] args) {
		
		OuterTest ot = new OuterTest();
		
		//ot.cat();
		
		OuterTest.InnerTest obj = new OuterTest.InnerTest();
		
		obj.cat();
		
		
	}
}

public class Exp17 {
	
	public static void main(String[] args) {
		
		OuterTest ot = new OuterTest();
		
		//ot.cat();
		
		OuterTest.InnerTest obj = new OuterTest.InnerTest();		
		obj.cat();
		
	}

}
