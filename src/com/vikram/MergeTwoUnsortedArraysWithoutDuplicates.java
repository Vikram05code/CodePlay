package com.vikram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArraysWithoutDuplicates {
	
	public static void main(String[] args) {
		int[] array1 = {12, 8,18,13,10,16,17,25,20};
		int[] array2 = {22, 18,28,23,10,26,17,35,10};
		int[] array3 = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(array3));
	}

}
