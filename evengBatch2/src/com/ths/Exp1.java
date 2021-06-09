package com.ths;

public class Exp1 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("i am from run() "+Thread.currentThread().getName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Max_Priority : "+MAX_PRIORITY);//10
		System.out.println("Norm_Priority : "+NORM_PRIORITY);//5
		System.out.println("Min_Priority : "+MIN_PRIORITY);//1
		
		Exp1 t1 = new Exp1();
		Exp1 t2 = new Exp1();
		Exp1 t3 = new Exp1();
		Exp1 t4 = new Exp1();
		
		Exp1 t5 = new Exp1();
		Exp1 t6 = new Exp1();
		
		System.out.println("Default Thread Priority : "+t1.getPriority());//NORM_PRIORITY
		
		t1.setPriority(MAX_PRIORITY);
		
		System.out.println("After Thread Priority : "+t1.getPriority());//MAX
		
		System.out.println("Default Thread name : "+t1.getName());//Thread-0
		System.out.println("Default Thread name : "+t2.getName());//Thread-1
		System.out.println("Default Thread name : "+t3.getName());//Thread-2
		System.out.println("Default Thread name : "+t4.getName());//Thread-3
		
		t1.setName("account");
		t2.setName("withdraw");
		t3.setName("transfer");
		t4.setName("credit");
		
		System.out.println("After Thread Priority : "+t1.getName());//
		System.out.println("After Thread Priority : "+t2.getName());//
		System.out.println("After Thread Priority : "+t3.getName());//
		System.out.println("After Thread Priority : "+t4.getName());//
		
		t4.start();
		
		
	}
}
