package com.clts;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exp5 {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<>();
		
		tm.put("lenovo", 3000);
		tm.put("asus", 4000);
		tm.put("dell", 3500);
		tm.put("samsung", 3000);
		tm.put("sony", 4000);
		tm.put("apple", 4500);
		
		System.out.println(tm);
		
		for(String k : tm.keySet())
		{
			System.out.print("Prodcut : "+k);
			
			for(Integer v : tm.values())
			{
				System.out.println(" Price : "+v);
				break;
			}
		}
		System.out.println("********************");
		Iterator<Entry<String, Integer>> itr = tm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> et = itr.next();
			
			System.out.println("Product : "+et.getKey()+" Price : "+et.getValue());
		}
		
	}

}
