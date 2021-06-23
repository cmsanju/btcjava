package p1;

public class Exp3 
{
	private int a = 23;
	        int b = 40;
	protected int c = 50;
	public int d = 70;
	
	public void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}

class Exp4 extends Exp3
{
	public void disp()
	{
		//System.out.println(a); private 
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
