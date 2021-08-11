package com.test;

public class Student implements Comparable<Student>
{
	private int id;
	
	private String name;
	
	private int year;
	
	public int compareTo(Student std)
	{
		return this.year - std.year;
	}
	
	public Student(int id, String name, int year)
	{
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
	
	
}
