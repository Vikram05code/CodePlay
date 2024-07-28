package com.vikram;

public class SwapTwoStringWithoutUsingThirdVariable {
	
	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		swapTwoString(a, b);
		
		
	}
	
	public static void swapTwoString(String a, String b) {
		System.out.println("Strings Before Swapping : "+"a="+a+", b="+b);
		a = a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("Strings After Swapping : "+"a="+a+", b="+b);

		
	}

}
