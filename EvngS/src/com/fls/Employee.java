package com.fls;

import java.io.Serializable;

public class Employee implements Serializable
{
	
	public String name;
	public String city;
	public transient int pin;
	public String state;
	
	public void disp()
	{
		System.out.println(name+" "+city+" "+pin+" "+state);
	}

}
