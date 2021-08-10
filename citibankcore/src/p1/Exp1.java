package p1;

public class Exp1 {
	
	public int x = 10;
	       int y = 20;
	protected int z = 30;
	private int a = 90;
	
	public void disp()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
}
class Exp2 extends Exp1
{
	public void disp()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		//System.out.println(a);
	}
}
