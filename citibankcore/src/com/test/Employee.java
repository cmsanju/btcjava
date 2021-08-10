package com.test;

public class Employee //POJO PLAIN OLD JAVA OBJECTS
{
	
	public Employee()
	{
		System.out.println("Default");
	}
	
	public Employee(int id, String name)
	{
		System.out.println("Prameterised");
	}
	
	public Employee(String name, int id)
	{
		System.out.println("Overloaded");
	}
	
	public Employee(Employee obj)
	{
		System.out.println("Object parameterised");
	}
	
	public void disp()
	{
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		Employee obj2 = new Employee(30, "citi");
		Employee obj3 = new Employee("bank", 34);
		Employee obj4 = new Employee(obj1);
		
	}

}

class Test
{
	Employee obj = null;
	
	public  Test(Employee obj)
	{
		this.obj = obj;
		
		obj.disp();
	}
	
	public static void main(String[] args) {
		
		Employee obj2 = new Employee();
		
		Test obj1 =new Test(obj2);
	}
	
}
