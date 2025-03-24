package com.vikram;
//Write a Java Program to reverse a string without using String inbuilt function.


public class ReverseStringWithoutInbuiltMethod {
	
	public static String reverseString(String str) {
		
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
			
		}
		
		return new String(charArray);
	}
	
	public static void main(String[] args) {
		String str = "Java Coding";
		System.out.println(reverseString(str));
	}

}
