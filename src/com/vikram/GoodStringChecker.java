package com.vikram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GoodStringChecker {
	
	public static boolean checkGoodString(String str) {
		
		Map<Character, Integer> freqHashMap = new HashMap<>();
		
		for(Character c : str.toCharArray()) {
			freqHashMap.put(c, freqHashMap.getOrDefault(c, 0)+1);
		}
		
		Set<Integer> uniqueFrequencies = new HashSet<>(freqHashMap.values());
		
		return uniqueFrequencies.size()==1;
		
	}
	
	
	public static void main(String[] args) {
		String str = "aabbcc";
		boolean result = checkGoodString(str);
		if(result) {
			System.out.println("Good String");
		}else {
			System.out.println("It's not a good String");
		}
		
	}

}
