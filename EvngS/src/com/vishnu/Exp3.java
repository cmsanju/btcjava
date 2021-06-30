package com.vishnu;

interface X
{
	void add();
	
	interface Y
	{
		void sub();
	}
}

class Ximpl implements X.Y
{
	public void sub()
	{
		System.out.println("overrided sub");
	}
	
	public void add()
	{
		System.out.println("overrided add");
	}
}

public class Exp3 {
	
	public static void main(String[] args) {
		
		Ximpl x = new Ximpl();
		
		x.sub();
	}

}
