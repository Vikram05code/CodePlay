package com.vikram;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		int[] arr = { 12, 8, 0, 10, 0, 17, 20, 24 };
		System.out.println("Before : ");
		printArray(arr);

		System.out.println();

		System.out.println("After : ");
		moveZeroes(arr);
		printArray(arr);

	}

	public static void printArray(int[] arr) {

		Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

	}

	public static void moveZeroes(int[] arr) {

		int i = 0;
		int j = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
	}

}
