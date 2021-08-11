package com.test;

import java.util.ArrayList;
import java.util.Collections;



public class TestStd {
	
	public static void main(String[] args) {
		
		ArrayList<Student> stdList = new ArrayList<>();
		
		stdList.add(new Student(111, "varun", 2015));
		stdList.add(new Student(222, "varun1", 2010));
		stdList.add(new Student(333, "Hero", 2000));
		stdList.add(new Student(444, "user", 2017));
		
		Collections.sort(stdList);
		
		for(Student std : stdList)
		{
			System.out.println(std.getId()+" "+std.getName()+" "+std.getYear());
		}
	}

}
