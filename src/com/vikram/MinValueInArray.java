package com.vikram;

public class MinValueInArray {

	public static void main(String[] args) {
		
		int[] arr = {10, 12, 5, 25, 30, 2, 8};
		int result = minValueArray(arr);
		System.out.println("Minimum Value of Given Array is : "+ result);
		
	}
	
	public static int minValueArray(int[] arr) {
		
		int minValue = Integer.MAX_VALUE;
		int n=arr.length;
		if(arr==null || n==0) {
			throw new IllegalArgumentException();
		}
		for(int i=0; i<n; i++) {
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
		}
		return minValue;
	}
	
	
}
