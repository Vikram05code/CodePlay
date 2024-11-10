package com.vikram;

import java.util.HashMap;
import java.util.Map;

public class CopyOneHashMapToAnother {

	public static void main(String[] args) {
         Map<String, Integer> originalMap = new HashMap<String, Integer>();
         originalMap.put("Java", 1);
         originalMap.put("Python", 2);
         originalMap.put("C++", 3);
         originalMap.put("Ruby", 4);
         
         System.out.println(copyMap(originalMap));
	}

	public static <K, V> Map<K, V> copyMap(Map<K, V> original) {
       //First way to do this
		/*
		Map<K, V> newMap = new HashMap<K, V>();

		for (Map.Entry<K, V> entry : original.entrySet())
			newMap.put(entry.getKey(), entry.getValue());
		return newMap;
		*/
		
		//Second way to do this
		/*
		Map<K, V> newMap = new HashMap<K, V>();
		newMap.putAll(original);
		
		return newMap;
		*/
		
		//Third way to do this
		
		Map<K, V> newMap = new HashMap<K, V>(original);
		
		return newMap;
	}

}
