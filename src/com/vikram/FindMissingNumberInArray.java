package com.vikram;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 6, 5, 1, 8, 3, 2, 4, 9 };
		
		int missingNumber = missingNum(arr);
		System.out.print("Missing number from array : "+ missingNumber);

	}

	public static int missingNum(int[] arr) {

		int n = arr.length+1;
		int sum = n * (n + 1) / 2;

		for (int num : arr) {
			sum = sum - num;
		}
		return sum;
	}

}
