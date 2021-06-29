package p1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(badMethod());
	
	}
	
	public static String badMethod()
	{
		try {
			System.out.println("TEST");
			System.exit(0);
			return "rupesh";
		} catch (Exception e) {
			return "catch";
			
			
		}
		finally
		{
			return "Cognizant";
		}
		
		
	
	}

}
