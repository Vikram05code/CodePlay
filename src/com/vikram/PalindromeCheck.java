/*Given an integer x, return true if x is a palindrome, and false otherwise.
 */


package com.vikram;

import java.util.Scanner;

public class PalindromeCheck {
	
	public static boolean  isPalindrome(int num) {
		
		if(num<0) {
			System.out.println("Number "+num +" is not Palindrome");
			return false;
		}
		int reversed = 0;
		int newNum = num;
		while(newNum != 0) {
			int digit = newNum%10;
			reversed = reversed*10+digit;
			newNum /= 10;
		}
		if(reversed==num) {
			System.out.println("Number "+num+" is Palindrome");
			return true;
		}
		System.out.println("Number "+num +" is not Palindrome");
		return false;
		
	}
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Valid Number: ");
		int number = scanner.nextInt();
	 PalindromeCheck.isPalindrome(number);
		
	}
	
	
}
