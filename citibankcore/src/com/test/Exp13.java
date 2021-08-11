package com.test;

//inside the interface only one abstract method 
@FunctionalInterface
interface Inf3
{
	void greet();
	
	default void show()
	{
		
	}
}



public class Exp13 {
	
	public void disp()
	{
		
	}
	
	public static void main(String[] args) {
		
		Inf3 obj = new Inf3()
				{
				
					public void greet()
					{
						System.out.println("overrided");
					}
					
					
			
				};
				
				obj.greet();
				
		Inf3 obj1 = () -> System.out.println("overrided with java 8 feature");
		
		obj1.greet();
		
		obj1.show();
	}

}
