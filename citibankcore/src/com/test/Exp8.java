package com.test;


class F
{
	public void draw1()
	{
		System.out.println("tle");
	}
}

class G extends F
{
	public void draw2()
	{
		System.out.println("cle");
	}
}

class H extends F
{
	public void draw3()
	{
		System.out.println("rtle");
	}
}

public class Exp8 {
	
	public static void main(String[] args) {
		
		G g = new G();
		g.draw1();//
		g.draw2();
		
		H h = new H();
		h.draw1();//
		h.draw3();
				
		
		
	}

}
