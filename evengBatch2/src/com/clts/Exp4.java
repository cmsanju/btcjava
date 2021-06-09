package com.clts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exp4 {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("rollno", 1234);
		m.put(12, "id");
		m.put('A', "grade");
		m.put(34.56, 23);
		m.put("name", "Java");
		m.put("hello", 657);
		m.put("name", "apple");
		
		System.out.println(m);
		
		Iterator<Entry> itr = m.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry et = itr.next();
			
			System.out.println(et.getKey()+" "+et.getValue());
		}
		
		System.out.println(m.get(12));
		
		LinkedHashMap lm = new LinkedHashMap();
		
		lm.put("rollno", 1234);
		lm.put(12, "id");
		lm.put('A', "grade");
		lm.put(34.56, 23);
		lm.put("name", "Java");
		lm.put("hello", 657);
		lm.put("name", "apple");
		
		System.out.println(lm);
		
		Iterator<Entry> itr1 = lm.entrySet().iterator();
		
		while(itr1.hasNext())
		{
			Entry et = itr1.next();
			
			System.out.println(et.getKey()+" "+et.getValue());
		}
		
	}

}
