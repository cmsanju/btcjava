package com.clts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Exp2 {
	
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
		 
		 LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
		 
 
		 lm.put("lenevo", 2300);
		 lm.put("asus", 450);
		 lm.put("dell", 3000);
		 lm.put("sony", 4000);
		 lm.put("macbook", 2450);
		 lm.put("macbook", 5000);
		 lm.put("ipod", 2300);
		 
		 System.out.println(lm);
		 
		 TreeMap<String, Integer> tm = new TreeMap<>();
		 
 
		 tm.put("lenevo", 2300);
		 tm.put("asus", 450);
		 tm.put("dell", 3000);
		 tm.put("sony", 4000);
		 tm.put("macbook", 2450);
		 tm.put("macbook", 5000);
		 tm.put("ipod", 2300);
		 
		 System.out.println(tm);
		 
		 tm.forEach((k,v) -> System.out.println("Porduct : "+k+" Price : "+v));
	}

}
