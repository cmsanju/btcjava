package com.test;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private int pincode;
	
	public Person()
	{
		
	}
	
	public Person(String name, int age, String address, int pincode) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
