package com.test;

public class Exp7 implements I
{
	public void disp()
	{
		System.out.println("overrided");
	}
	
	public static void main(String[] args) {
		
		Exp7 e = new Exp7();
		
		e.disp();
		//e.show();
		
		I.show();
	}

}
