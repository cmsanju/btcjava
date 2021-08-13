package com.ths;

public class Exp5 implements Runnable
{
	public void run()
	{
		System.out.println("run()");
	}
	
	public static void main(String[] args) {
		
		Exp5 t1 = new Exp5();
		
		ThreadGroup tg1 = new ThreadGroup("Bank");
		
		Thread t2 = new Thread(tg1, t1,"Credit");
		Thread t3 = new Thread(tg1, t1, "Transfer");
		Thread t4 = new Thread(tg1, t1, "withdraw");
		
		ThreadGroup tg2 = new ThreadGroup("Maths");
		
		Thread t5 = new Thread(tg2, t1, "Add");
		Thread t6 = new Thread(tg2, t1, "sub");
		Thread t7 = new Thread(tg2, t1, "div");
		
		t2.start();
		t4.start();
		System.out.println("Tg1 active threads : "+tg1.activeCount());
		
		t6.start();
		t7.start();
		System.out.println("Tg2 active threads : "+tg2.activeCount());
		
		tg1.destroy();
		
		System.out.println(tg1.isDestroyed());
	}
}
