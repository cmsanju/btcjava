package com.test;


class SingleTon1
{
	private static SingleTon1 obj = null;
	
	public String name;
	
	private SingleTon1()
	{
		name = "This is singleton1 example ";
	}
	
	public static SingleTon1 getObj()
	{
		if(obj == null)
		{
			obj = new SingleTon1();
		}
		return obj;
	}
}

public class SingleTon1Test {
	
	public static void main(String[] args) {
		
		SingleTon1 obj1 = SingleTon1.getObj();
		
		System.out.println(obj1.name);
		
		SingleTon1 obj2 = SingleTon1.getObj();
		
	}

}
