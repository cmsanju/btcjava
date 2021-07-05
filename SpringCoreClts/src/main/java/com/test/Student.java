package com.test;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String clg;
	private List<String> job;
	
	private List<Course> crs;
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, String clg, List<Course> crs) {
		
		this.id = id;
		this.name = name;
		this.clg = clg;
		this.crs = crs;
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
	

	public List<Course> getCrs() {
		return crs;
	}



	public void setCrs(List<Course> crs) {
		this.crs = crs;
	}
	
	public List<String> getJob() {
		return job;
	}

	public void setJob(List<String> job) {
		this.job = job;
	}
	
	public void disp()
	{
		System.out.println(id+" "+name+" "+clg);
		
		for(Course list : crs)
		{
			System.out.println(list.getCname()+" "+list.getDuration()+" "+list.getLoc());
		}
		
		for(String j : job)
		{
			System.out.println(j);
		}
	}

	

}
