package com.telusko.tutorial.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsArrayListDemo {
	public static void main(String[] args) {
		List values = new ArrayList();
		values.add("JYoti");
		values.add(1);
		values.add(1.5);
		values.add(2, "Ranjan"); //We can use List to add values at a specific index
		
		Iterator it = values.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
