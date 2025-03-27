package com.vikram;

public class RemoveWhiteSpaceFromString {
	
	public static String removeWhiteSpace(String input) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)!=' ') {
				sb.append(input.charAt(i));
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String input = "Hello Java Programmer";
		System.out.println(removeWhiteSpace(input));
	}

}
