package com.vikram;

import java.util.HashMap;

public class CountNumberOfWordsInString {

	public static HashMap<String, Integer> countNumberOfWordsUsingHashMap(String str) {

		String[] stringArray = str.split("\\s");
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		for (String string : stringArray) {

			wordCountMap.put(string, wordCountMap.getOrDefault(string, 0) + 1);

		}

		return wordCountMap;
	}

	public static void main(String[] args) {

		String str = "Java Code Coding Java Code Java Coding Program Coding Java Code";
		System.out.println(countNumberOfWordsUsingHashMap(str));
		
	}

}
