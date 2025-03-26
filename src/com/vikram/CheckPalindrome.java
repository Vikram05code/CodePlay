package com.vikram;

public class CheckPalindrome {
	
	public static boolean isPalindrome(String input) {
		int left = 0;
		int right = (input.length())-1;
		while(left<right) {
			if(input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "nitin";
		System.out.println(isPalindrome(str));
	}

}
