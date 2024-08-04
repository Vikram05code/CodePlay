package com.vikram;
//Find all Fibonacci numbers till n and add up only the even indices.

public class AddEvenFibonacciSeriesIndices {

	public static void main(String[] args) {
		int n=12;
		int result = sumEvenFibonacci(n);
		System.out.println("Sum of Even Fibonacci series indices till "+n+" =  "+result);

	}

	static int sumEvenFibonacci(int n) {

		int[] fib = new int[2 * n + 1];
		fib[0] = 0;
		fib[1] = 1;
		int sum = 0;

		for (int j = 2; j <= n; j++) {
			fib[j] = fib[j - 1] + fib[j - 2];

			if (j % 2 == 0) {
				sum += fib[j];
			}
		}

		return sum;
	}

}
