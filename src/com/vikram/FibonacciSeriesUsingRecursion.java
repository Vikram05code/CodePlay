package com.vikram;

public class FibonacciSeriesUsingRecursion {
	
	public static int fibonacciSeries(int n) {
		if(n<=1) {
			return n;
		}
		
		return fibonacciSeries(n-1)+fibonacciSeries(n-2);
	}
	
	
	public static void main(String[] args) {
		int n = 10;
		for(int i=0; i<n; i++) {
			System.out.print(fibonacciSeries(i)+" ");
		}
	}

}
