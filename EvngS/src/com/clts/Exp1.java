package com.clts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Exp1 
{
	 public static void main(String[] args) {
		
		 HashMap<String, Integer> hm = new HashMap<>();
		 
		 hm.put("lenevo", 2300);
		 hm.put("asus", 450);
		 hm.put("dell", 3000);
		 hm.put("sony", 4000);
		 hm.put("macbook", 2450);
		 hm.put("macbook", 5000);
		 hm.put("ipod", 2300);
		 
		 System.out.println(hm);
		 
		 
		 Iterator<Entry<String, Integer>> itr = hm.entrySet().iterator();
		 
		 while(itr.hasNext())
		 {
			 Entry<String, Integer> et = itr.next();
			 
			 System.out.println("Product : "+et.getKey()+" Price : "+et.getValue()); 
		 }
		 
		 for(String str : hm.keySet())
		 {
			 System.out.println("Key : "+str+" Value : "+hm.get(str));
		 }
		 
		 System.out.println("***********************");
		 
		 hm.forEach((k,v) -> System.out.println("Key : "+k+" Value : "+v));
	}
}
