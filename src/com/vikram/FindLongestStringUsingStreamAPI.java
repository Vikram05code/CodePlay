package com.vikram;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestStringUsingStreamAPI {
	
	public static String findLongestString(String[] stringArray) {
		
		String longestString = Arrays.stream(stringArray).max(Comparator.comparingInt(String::length)).orElse("No String found");
		System.out.println(longestString);
		
		return longestString;
	}
	
	public static void main(String[] args) {
		String[] stringArray = {"Banana", "Apple", "Java", "Springboot", "python", "javadevelepor"};
		findLongestString(stringArray);
	}

}
