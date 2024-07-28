package com.vikram;

public class SwapNumbersWithoutUsingThirdVariable {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		swapNumberWithoutThirdVariable(a, b);
		
	}
	
 public static void swapNumberWithoutThirdVariable(int a, int b) {
		
		System.out.println("Before swapping:  "+"a="+a+", b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping:  "+"a="+a+", b="+b);
		
		
	}

}
