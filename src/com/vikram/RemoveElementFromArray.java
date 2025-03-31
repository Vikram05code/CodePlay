package com.vikram;

public class RemoveElementFromArray {
	
	public static int removeElement(int[] arr, int val) {
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != val) {
				arr[j] = arr[i];
				j++;
			}
		}
		return j;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {20, 10, 12, 32, 15, 20, 16, 27, 20};
		int val = 20;
		System.out.println(removeElement(arr, val));
	}

}
