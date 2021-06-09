package com.ths;

public class Exp2 implements Runnable
{
	@Override
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
	
	public static void main(String[] args) {
		
		Exp2 t1 = new Exp2();
		
		//t1.start();
		
		ThreadGroup tg1 = new ThreadGroup("Bank");
		
		Thread t2 = new Thread(tg1,t1,"transfer");
		Thread t3 = new Thread(tg1,t1,"credit");
		Thread t4 = new Thread(tg1,t1,"credit");
		
		ThreadGroup tg2 = new ThreadGroup("Maths");
		
		Thread t5 = new Thread(tg2,t1,"add");
		Thread t6 = new Thread(tg2,t1,"sub");
		Thread t7 = new Thread(tg2,t1,"div");
		
		
		t2.start();
		t4.start();
		System.out.println("Tg1 active ths : "+tg1.activeCount());
		
		t6.start();
		t7.start();
		System.out.println("Tg2 active ths : "+tg2.activeCount());
		
		t5.setDaemon(true);
		
		
		
	}
}
