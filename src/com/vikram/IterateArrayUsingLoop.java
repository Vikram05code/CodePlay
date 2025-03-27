package com.vikram;

public class IterateArrayUsingLoop {
	
	
	public static void iterateArray(int[] arr) {
		//using for loop
		System.out.println("Using for Loop");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//using while loop
		System.out.println();
		System.out.println("Using while Loop");
		int num = 0;
		while(num <arr.length) {
			System.out.print(arr[num]+" ");
			num++;
		}
		System.out.println();
		System.out.println("Using advance for Loop");
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4,7,8,9,23,12,45,67,5};
		
		iterateArray(arr);
	}

}
