//Write a Java Program for a given array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.

package com.vikram;

public class ArrayRotation {
	

	public static void main(String[] args) {
		int[] arr = {10, 12, 6, 18, 3, 17, 18, 13, 27, 28};
		int n=arr.length;
		int d= 4;
		System.out.println("Array Before Rotation: ");
		printArray(arr);
		System.out.println();
		rotateArray(arr, n, d);
		System.out.println("Array After Rotation: ");
		printArray(arr);
		
	}
	
	// Function to rotate array
	public static void rotateArray(int arr[], int n, int d) {
		
		// Storing rotated version of array
		int[] temp = new int[n];
		
		 // Keeping track of the current index
	    // of temp[]
		int k=0;
		
		// Storing the n - d elements of
	    // array arr[] to the front of temp[]
		for(int i=d; i<n; i++) {
			temp[k]=arr[i];
			k++;
		}
		
		// Storing the first d elements of array arr[]
	    // into temp
		for(int i=0; i<d; i++) {
			temp[k]=arr[i];
			k++;
		}
		
		// Copying the elements of temp[] in arr[]
	    // to get the final rotated array
		for(int i=0; i<n; i++) {
			arr[i]=temp[i];
		}
		
	}
	
	// Function to print elements of array
	
	public static void printArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	

}
