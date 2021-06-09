	package com.ths;

public class LifeCycle extends Thread
{
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(2000);
			System.out.println("i am from run()");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		
		LifeCycle t1 = new LifeCycle();
		
		System.out.println("Before starting thread state : "+t1.getState());//NEW
		System.out.println("Before starting thread status : "+t1.isAlive());//false
		
		t1.start();
		
		System.out.println("after starting thread state : "+t1.getState());//RUNNABLE
		System.out.println("after starting thread status : "+t1.isAlive());//true
		
		Thread.sleep(1000);
		
		System.out.println("in sleep thread state : "+t1.getState());//TIMED_WAITING
		System.out.println("in sleep thread status : "+t1.isAlive());//true
		
		t1.join();
		
		System.out.println("after joinig thread state : "+t1.getState());//TERMINATED
		System.out.println("after joining thread status : "+t1.isAlive());//false
		
	}
}
