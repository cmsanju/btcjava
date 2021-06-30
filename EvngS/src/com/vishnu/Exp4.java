package com.vishnu;

@FunctionalInterface
interface FunctionInf
{
	void human();
	
	//void hello();
	
	default void fox()
	{
		
	}
	static void dog()
	{
		
	}
}

public class Exp4 {
	
	public static void main(String[] args) {
		
		FunctionInf obj = new FunctionInf() {
			
			@Override
			public void human() {
				
				System.out.println("overrided");
			}
		};
			obj.human();
			
			//lambda expression java 8 new feature
			
			FunctionInf obj2 = () -> System.out.println("hello override");
			
			obj2.human();	
	}

}

// marker / tagged interfaces
//java.lang.Cloneable / java.io.Serializable / java.rmi.Remote
