package com.vikram;

public class ResizeArray {

	public static void main(String[] args) {

		int[] arr = { 21, 12, 4, 8, 10, 13 };

		System.out.println("Array Before Resize: ");
		printArray(arr);

		System.out.println();
		System.out.println("Array After Resize: ");
		printArray(resizeArray(arr, 10));

	}

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] resizeArray(int[] arr, int capacity) {

		int[] temp = new int[capacity];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}

		return temp;
	}

}
