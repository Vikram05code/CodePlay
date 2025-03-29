package com.vikram;

import java.util.Arrays;

public class SortAndConcatenateString {
	
	public static String sortAndConcatenate(String input) {
		String[] stringArr = input.split(",");
		Arrays.sort(stringArr);
		
		return String.join("", stringArr);
	}
	
	
	public static void main(String[] args) {
		String str = "hello, java, programmer, how, are, you, doing";
		System.out.println(sortAndConcatenate(str));
	}
	

}
