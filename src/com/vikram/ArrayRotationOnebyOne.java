//Java Program For Array Rotation by rotating one-by-one:
package com.vikram;

public class ArrayRotationOnebyOne {
	
	public static void main(String[] args) {
		
		int[] arr = {12, 10, 8, 14, 26, 16, 18, 20, 5, 7, 8, 9};
		int d= 5;
		System.out.println("Array Before Rotation: ");
		printArray(arr);
		System.out.println();
		rotate(arr, d);
		System.out.println("Array After Rotation: ");
		printArray(arr);
		
	}
	
	public static void rotate(int[] arr, int d) {
		
		int n=arr.length;
		int k=1;
		while(k<=d) {
			int last=arr[0];
					for(int i=0; i<n-1; i++) {
						arr[i] = arr[i+1];
					}
					arr[n-1] = last;
					k++;
		}
	
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
