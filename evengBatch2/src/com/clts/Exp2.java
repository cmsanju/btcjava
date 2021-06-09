package com.clts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exp2 {
	public static void main(String[] args) {
		Set hs = new HashSet();
		
		hs.add(10);
		hs.add(45.85f);
		hs.add(45.76);
		hs.add("java");
		hs.add('A');
		hs.add(10);
		hs.add("java");
		hs.add(false);
		
		System.out.println(hs);
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(10);
		lhs.add(45.85f);
		lhs.add(45.76);
		lhs.add("java");
		lhs.add('A');
		lhs.add(10);
		lhs.add("java");
		lhs.add(false);
		
		System.out.println(lhs);
		
	}
}
