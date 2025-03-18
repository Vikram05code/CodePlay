package com.vikram;

public class FindPrimeNumber {
	
	public static boolean isPrimeNum(int num) {
		
		if(num==0 || num == 1) {
			return false;
		}
		boolean flag = true;
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag = false;
			}
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPrimeNum(4));
	}

}
