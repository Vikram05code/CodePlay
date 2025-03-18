package com.vikram;

import java.util.Arrays;
import java.util.HashSet;

public class FindVowel {
	
	public static String isVowel(char c){
        // code here
        HashSet<Character> vowelSet = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        
        return vowelSet.contains(Character.toLowerCase(c))?"YES":"NO";
    }
	
	public static void main(String[] args) {
		
		System.out.println(isVowel('i'));
	}

}
