package com.telusko.tutorial.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("actor", "Shahrukh");
		map.put("movie", "DDLG");
		map.put("age", "65");
		
		Set<String> keys = map.keySet();
		for (String key: keys)
			System.out.println(key + " " + map.get(key));
	}

}
