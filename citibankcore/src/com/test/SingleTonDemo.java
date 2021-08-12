package com.test;

class SingleTon
{
	private String name;
	
	private static SingleTon obj = null;
	
	private SingleTon()
	{
		name = "Java";
	}
	
	public SingleTon getSingleTonObject()
	{
		if(obj == null)
		{
			obj = new SingleTon();
		}
		
		return obj;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		SingleTon obj = new SingleTon();
		
		obj.getSingleTonObject();
		
		obj.getName();
	}
	
}

public class SingleTonDemo {
	
	public static void main(String[] args) {
		
		
	}

}
