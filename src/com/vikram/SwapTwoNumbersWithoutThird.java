package com.vikram;

public class SwapTwoNumbersWithoutThird {
	
	public static void swapTwoNumbers(int a, int b) {
		System.out.println("Before Swap: "+"a="+a+" b="+b);
		a = a+b;
		b= a-b;
		a= a-b;
		System.out.println("After Swap: "+"a="+a+" b="+b);
	}
	
	public static void main(String[] args) {
		int a= 10;
		int b=20;
		swapTwoNumbers(a,b);
	}

}
