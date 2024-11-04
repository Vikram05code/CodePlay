package com.vikram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrays {
	
	public static void main(String[] args) {
		int[] num1 = {10,7,15,19,29,56,13};
		int[] num2 = {20,7,25,29,39,36,23};
		int[] num3 = IntStream.concat(Arrays.stream(num1), Arrays.stream(num2)).sorted().toArray();
		System.out.println(Arrays.toString(num3));
		
	}

}
