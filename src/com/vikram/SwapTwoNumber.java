package com.vikram;

public class SwapTwoNumber {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		swapNumber(a, b);
		
	}
	
	public static void  swapNumber(int a, int b) {
		
		System.out.println("Before swapping:  "+"a="+a+", b="+b);
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping:  "+"a="+a+", b="+b);
	}

}
