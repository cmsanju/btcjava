package com.test.model;


public class Employee {
	
	private Integer id;
	
	private String fname;
	
	private String lname;
	
	private String city;
	
	public Employee()
	{
		
	}
	

	public Employee(Integer id, String fname, String lname, String city) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", city=" + city + "]";
	}
	
}
