package com.vikram;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = scan.nextInt();
		}

		int i = 0;
		int j = arr.length - 1;
		int temp = 0;

		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		System.out.print("Reversed  Array: ");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
