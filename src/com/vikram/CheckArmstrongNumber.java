package com.vikram;

public class CheckArmstrongNumber {
	
	
	public static boolean checkArmstrong(int number) {
		
		int length = String.valueOf(number).length();
		int temp = number;
		double sum=0;
		for(int i=0; i<length; i++) {
		sum += Math.pow(temp%10, length);
		temp=temp/10;
		}
		if(sum == number) {
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		int num = 153;
		System.out.println(checkArmstrong(num));
	}

}
