package com.ths;

public class LifeCycle extends Thread
{
	
	@Override
	public void run()
	{
		try {
			Thread.sleep(1000);
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
		
		//System.out.println("Before starting thread state : "+t1.getState());//NEW
		//System.out.println("Before starting thread status : "+t1.isAlive());//false
		//t1.run();
		t1.start();
		t1.interrupt();
		System.out.println(t1.isInterrupted());
		LifeCycle t2 = new LifeCycle();
		//t2.start();
		
		/*
		System.out.println("After starting thread state : "+t1.getState());//RUNNABLE
		System.out.println("After starting thread status : "+t1.isAlive());//true
		
		Thread.sleep(400);
		
		System.out.println("After sleep thread state : "+t1.getState());//TIMED_WAITING
		System.out.println("After sleept thread status : "+t1.isAlive());//true
		
		t1.join();
		
		System.out.println("after join method thread state : "+t1.getState());//TERMINATED
		System.out.println("after join method thread status : "+t1.isAlive());//false
		
		*/
		
		
	}

}
