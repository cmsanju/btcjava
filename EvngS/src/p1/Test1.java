package p1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		
		
		
		try {
			badMethod();
			System.out.println("a");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("b");
			
		}
		finally
		{
			System.out.println("c");
		}
		System.out.println("d");
		
	
	}
	public static void badMethod()
	{
		throw new Error();
	}

}
