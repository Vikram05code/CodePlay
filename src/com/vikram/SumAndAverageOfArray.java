package com.vikram;
//Given an integer array, find sum and average of all elements
import java.util.Arrays;

public class SumAndAverageOfArray {
	
	public static void main(String[] args) {
		int[] array = {20,15,28,40,79,19,39,27,45};
		int sum = Arrays.stream(array).sum();
		Double average = Arrays.stream(array).average().getAsDouble();
		System.out.println("Sum of Given Array is : "+sum);
		System.out.print("Average of Given Array is : ");
		System.out.println(String.format("%.2f", average));

	}

}
