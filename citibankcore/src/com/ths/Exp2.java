package com.ths;

class Exp3
{
	public void add()
	{
		System.out.println(20+40);
	}
}

class Exp4
{
	public void sub()
	{
		System.out.println(40-30);
	}
}

public class Exp2 implements Runnable
{
	public void run()
	{
		try
		{
			Exp3 e = new Exp3();
			e.add();
			
			Thread.sleep(2000);
			
			Exp4 e1 = new Exp4();
			
			e1.sub();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Exp2 t1 = new Exp2();
		
		//t1.start();
		
		Thread t2 = new Thread(t1,"Java");//converting runnable interface object into thread class
		
		t2.start();
		
		System.out.println("Thread name : "+t2.getName());
				
		
	}
}
