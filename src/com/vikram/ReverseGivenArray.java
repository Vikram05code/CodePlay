package com.vikram;

import java.util.Arrays;
public class ReverseGivenArray {
	
	public static void main(String[] args) {
		int[] array = {7,1,12,9,13,15,14,8};
		ReverseGivenArray reverseGivenArray = new ReverseGivenArray();
		reverseGivenArray.reverseArray(array);
	}
	
	public void reverseArray(int[] array) {
		System.out.println("Before reversing given array: ");
		System.out.println(Arrays.toString(array));
		for(int i=0; i<array.length/2; i++) {
			int other = array.length-1-i;
			int temp = array[i];
			array[i]=array[other];
			array[other]=temp;
		}
		System.out.println("After reversing given array: ");
		System.out.println(Arrays.toString(array));
		//Time Complexity: O(N)
	}

}
