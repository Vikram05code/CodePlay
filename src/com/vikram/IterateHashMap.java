package com.vikram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {
		Map<String, Integer> hasMap = new HashMap<>();
		hasMap.put("Java", 1);
		hasMap.put("Python", 2);
		hasMap.put("C++", 3);
        hasMap.put("Golang", 4);
        hasMap.put("Ruby", 5);
        
        for(Map.Entry<String, Integer> entrySet : hasMap.entrySet()) {
        	System.out.println(entrySet.getKey()+"="+entrySet.getValue());
        }
        //using forEach for Iterate HashMap
        Map<String, String> hasMap2 = new HashMap<>();
        hasMap2.put("J", "Java");
        hasMap2.put("P", "Python");
        hasMap2.put("R", "React");
        hasMap2.put("A", "Angular");
        hasMap2.put("G", "Golang");
        
       System.out.println("Iterate map using Lambda Expressions - forEach ");
        hasMap2.forEach((key, value)->System.out.println(key+"="+value));
        
        //using Iterator Iterate through HashMap
        
        Map<Integer, String> hashMap3 = new HashMap<>();
        hashMap3.put(1, "First");
        hashMap3.put(2, "Second");
        hashMap3.put(3, "Third");
        hashMap3.put(4, "Fourth");
        hashMap3.put(5, "Fifth");
        System.out.println("Iterate map using Iterator: ");
        Iterator<Entry<Integer, String>> mapIterator = hashMap3.entrySet().iterator();
        while(mapIterator.hasNext()) {
        	Map.Entry<Integer, String> newHashMap = mapIterator.next();
        	System.out.println(newHashMap.getKey()+"="+newHashMap.getValue());
        }
        
        
       //Loop through HashMap using Stream Api
        Map<Integer, String> hashMap4 = new HashMap<>();
        hashMap4.put(1, "Java");
        hashMap4.put(2, "Python");
        hashMap4.put(3, "C++");
        hashMap4.put(4, "Golang");
        
        System.out.println("Iterating HashMap using Stream API: ");
        hashMap4.entrySet().stream().forEach(input->System.out.println(input.getKey()+"="+input.getValue()));
        
  
        
	}

}


