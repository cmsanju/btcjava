package p2;

import p1.Exp3;

public class Exp1 
{
	Exp3 e = new Exp3();
	
	public void disp()
	{
		//System.out.println(e.a);
		//System.out.println(e.b);
		//System.out.println(e.c);
		System.out.println(e.d);
	}
}

class Exp2 extends Exp3
{
	public void disp()
	{
		//System.out.println(a);private
		//System.out.println(b);default
		System.out.println(c);
		System.out.println(d);
	}
}
