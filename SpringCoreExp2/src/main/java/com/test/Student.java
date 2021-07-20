package com.test;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String clg;
	
	private List<String> course;
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, String clg, List<String> course) {
		
		this.id = id;
		this.name = name;
		this.clg = clg;
		this.course = course;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	
	
	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}
	
	public void disp()
	{
		System.out.println("ID : "+id+" Name : "+name+" College : "+clg);
		
		System.out.println("Course Name : ");
		
		for(String crs : course)
		{
			System.out.println(crs);
		}
	}


}
