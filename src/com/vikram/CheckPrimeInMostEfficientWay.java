package com.vikram;

public class CheckPrimeInMostEfficientWay {
	
	public static boolean checkPrime(int num) {
		
		if(num<=1) {
			return false;
		}
		if(num<=3) {
			return true;
		}
		
		if(num%2==0 || num%3==0) {
			return false;
		}
		
		for(int i=5; i*i<=num; i+=6) {
			if(num % i==0 || num % (i+2)==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		int num= 32;
		System.out.println(checkPrime(num));
		
	}

}
