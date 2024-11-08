package com.vikram;

import java.util.stream.IntStream;

public class SumOfFirst10NaturalNumbers {
	
	public static void main(String[] args) {
		int sum = IntStream.range(1, 11).sum();
		System.out.println("Sum of First 10 Natural Numbers Using Java8: "+sum);
	}

}
