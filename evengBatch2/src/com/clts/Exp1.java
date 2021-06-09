package com.clts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exp1 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(10);
		list.add(45.85f);
		list.add(45.76);
		list.add("java");
		list.add('A');
		list.add(10);
		list.add("java");
		list.add(false);
		
		System.out.println(list);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(45.85f);
		ll.add(45.76);
		ll.add("java");
		ll.add('A');
		ll.add(10);
		ll.add("java");
		ll.add(false);
		
		System.out.println(ll);
		
		Iterator itr1 = ll.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println(ll.size());//8
		System.out.println(ll.contains(10));//true
		System.out.println(ll.get(6));//java
		
        ListIterator ltr = ll.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
	}

}
