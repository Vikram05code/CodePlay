package com.vikram;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharacterInString {
	
	public static void main(String[] args) {
		String str = "vikramsharma";
		printDuplicates(str);
	}
	
	public static void printDuplicates(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
	    char[] charArray = str.toCharArray();
	    
	    for(char  ch :charArray) {
	    	if(map.containsKey(ch)) {
	    		map.put(ch, map.get(ch)+1);	
	    	}else {
	    		map.put(ch, 1);
	    	}
	    }
	    
	    for(Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
	    	if(mapEntry.getValue()>1) {
	    		System.out.println(mapEntry.getKey()+": "+mapEntry.getValue());
	    	}
	    }
		
	}

}
