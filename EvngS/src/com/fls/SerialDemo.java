package com.fls;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fos = new FileOutputStream("src/employee.txt");
		
		ObjectOutputStream obj = new ObjectOutputStream(fos);
		
		Employee e = new Employee();
		
		e.name = "Java";
		e.city = "Blr";
		e.pin = 517325;
		e.state = "AP";
		
		obj.writeObject(e);
		
		System.out.println("Done.");
		
		
	}
}
