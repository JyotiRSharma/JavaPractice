package com.telusko.tutorial.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsArrayListDemo {
	public static void main(String[] args) {
		Collection values = new ArrayList();
		values.add("JYoti");
		values.add(1);
		values.add(1.5);
		
		Iterator it = values.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
