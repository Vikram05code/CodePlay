package com.vikram;
//Java program to Find Odd or Even number
public class FindEvenAndOddNum {
	
	public static String findEvenOdd(int num) {
		
		if(num==0) {
			return "Enter valid number";
		}else if(num % 2==0) {
			return "Even Number";
		}else {
			return "Odd Number";
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(findEvenOdd(13));
	}

}
