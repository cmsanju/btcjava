package p2;

import p1.Exp1;

public class Exp3 
{
	Exp1 e = new Exp1();
	
	public void disp()
	{
		System.out.println(e.x);//public
		//System.out.println(e.y);//default
		//System.out.println(e.z);//protected
		//System.out.println(e.a);//private
	}
}

class Exp4 extends Exp1
{
	public void disp()
	{
		
		//System.out.println(a);//private
		//System.out.println(y);//default
		System.out.println(z);//protected
		System.out.println(x);//public
		
	}
}
