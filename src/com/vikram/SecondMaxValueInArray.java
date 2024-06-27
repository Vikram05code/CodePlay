package com.vikram;

public class SecondMaxValueInArray {
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {12, 20, 15, 10, 21, 30};
		
		System.out.print("Second Maximum Value in the given Array is : ");
		System.out.print(secondMaxValue(arr));
		
	}
	
	public static int secondMaxValue(int[] arr) {
		
		int maxValue = Integer.MIN_VALUE;
		int secondMaxValue = Integer.MIN_VALUE;
		
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i] > maxValue) {
				secondMaxValue = maxValue;
				maxValue = arr[i];
			}
			else if(arr[i]>secondMaxValue && arr[i] != maxValue){
				secondMaxValue = arr[i];
			}
		}
		return secondMaxValue;
	}
	
	

}
