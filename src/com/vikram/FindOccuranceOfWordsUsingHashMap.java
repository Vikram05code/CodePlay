package com.vikram;
//Java Program to Find the Occurrence of Words in a String using HashMap

import java.util.HashMap;
import java.util.Map;


public class FindOccuranceOfWordsUsingHashMap {
	
	public static void main(String[] args) {
		String str = "Java is a programming language and Springboot is a java framework";
		//first way to do this
		Map<String, Integer> hasMap = new HashMap<>();
		String[] words = str.split(" ");
		
		for(String word :words) {
			word=word.toLowerCase();
			Integer value = hasMap.get(word);
			if(value==null) {
				hasMap.put(word, 1);
			}else {
				hasMap.put(word, value+1);
			}
		}
		System.out.println(hasMap);
		
		
		//second way to do this
		Map<String, Integer> hasMap2 = new HashMap<>();
		for(String word :words) {
			word = word.toLowerCase();
			if(hasMap2.containsKey(word)) {
				hasMap2.put(word, hasMap2.get(word)+1);
			}else {
				hasMap2.put(word, 1);
			}
		}
		System.out.println(hasMap2);
	}
	

}


