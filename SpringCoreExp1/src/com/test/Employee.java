package com.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int id;
	private String name;
	private String cmp;
	
	@Autowired
	private Address adr;
	
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
		System.out.println("ID : "+id+" Name : "+name+" Company : "+cmp);
		
		adr.show();
	}
	
}
