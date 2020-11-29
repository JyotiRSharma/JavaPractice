package com.telusko.tutorial.collection;

//Sorting the collections with the help of last digit
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = new ArrayList<>();
		values.add(123);
		values.add(435);
		values.add(521);
		values.add(232);
		
//		Comparator<Integer> c = new Comparator<>() {
//			
//			public int compare(Integer i, Integer j) {
//				return i%10 > j%10 ? 1 : -1;
//			}
//			
//		};
		
		Collections.sort(values, (i, j) -> 
		i%10 > j%10 ? 1 : -1);
		
		
		System.out.println(values);

	}

}
