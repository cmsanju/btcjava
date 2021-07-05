package com.test;

public class Employee 
{
	private int id;
	private String name;
	private String cmp;
	
	private Address adr;
	
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, String cmp, Address adr)
	{
		this.id = id;
		this.name = name;
		this.cmp = cmp;
		this.adr = adr;
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
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	
	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}
	
	public void disp()
	{
		System.out.println(id+" "+name+" "+cmp);
		
		adr.details();
	}

	
}
