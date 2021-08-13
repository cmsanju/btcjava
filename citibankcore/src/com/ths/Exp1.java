package com.ths;

public class Exp1 extends Thread
{
	 public void run()
	 {
		 System.out.println("run()");
	 }
	 
	 public static void main(String[] args) {
		
		 Exp1 t1 = new Exp1();
		 Exp1 t2 = new Exp1();
		 Exp1 t3 = new Exp1();
		 
		 System.out.println(MAX_PRIORITY);//10
		 System.out.println(NORM_PRIORITY);//5
		 System.out.println(MIN_PRIORITY);//1
		 
		 System.out.println("default thread name : "+t1.getName());
		 System.out.println("default thread name : "+t2.getName());
		 System.out.println("default thread name : "+t3.getName());
		 
		 t1.setName("WITHDRAW");
		 t2.setName("CREDIT");
		 t3.setName("Transfer");
		 
		 System.out.println(" thread name : "+t1.getName());
		 System.out.println(" thread name : "+t2.getName());
		 System.out.println(" thread name : "+t3.getName());
		 
		 System.out.println("default thread priority : "+t1.getPriority());
		 System.out.println("default thread priority : "+t2.getPriority());
		 System.out.println("default thread priority : "+t3.getPriority());
		 
		 t1.setPriority(MAX_PRIORITY);
		 t3.setPriority(MIN_PRIORITY);
		 
		 System.out.println(" thread priority : "+t1.getPriority());
		 System.out.println(" thread priority : "+t3.getPriority());
		
	}
}
