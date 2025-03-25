package com.vikram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMapUsingForLoopAndWhileLoop {
	
	public static void iterateHashMap(HashMap<String, String> hashMap) {
		//using advance for loop
		System.out.println("using advance for loop");
		for(Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		//using while loop
		System.out.println();
		System.out.println("using while loop");
		Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		HashMap<String, String> hashMap  = new HashMap<>();
		hashMap.put("Java", "1st");
		hashMap.put("Python", "2nd");
		hashMap.put("C++", "3rd");
		hashMap.put("C", "4th");
		
		iterateHashMap(hashMap);
		
	}

}
