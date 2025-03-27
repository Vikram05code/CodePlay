package com.vikram;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInString {
	
	public static void findDuplicates(String input) {
		Map<Character, Integer> charCount = new HashMap<>();
		for(char c : input.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" appears "+entry.getValue()+" times");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		String str = "JavaProgramming";
		findDuplicates(str);   
		
	}

}
