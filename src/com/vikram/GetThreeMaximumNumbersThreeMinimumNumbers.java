package com.vikram;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetThreeMaximumNumbersThreeMinimumNumbers {
	
	public static void main(String[] args) {
		List<Integer> listofIntegers = Arrays.asList(12,13,14,10,29,7,35,17,28,30,5,2,4);
		List<Integer> minThreeIntegers = listofIntegers.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println("First Three Minimum Numbers from given List ");
	    System.out.println(minThreeIntegers);
		List<Integer> maxThreeIntegers = listofIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println("First Three Maximum Numbers from given List ");
		 System.out.println(maxThreeIntegers);
	}

}
