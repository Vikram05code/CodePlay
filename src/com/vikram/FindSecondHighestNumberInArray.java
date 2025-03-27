package com.vikram;

public class FindSecondHighestNumberInArray {

	public static int findSecondHighestNum(int[] arr) {

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > highest) {
				secondHighest = highest;
				highest = num;

			}
			if (num < highest && num > secondHighest) {
				secondHighest = num;
			}
		}

		return secondHighest;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 25, 17, 30, 40, 28, 33, 43 };

		System.out.println(findSecondHighestNum(arr));

	}

}
