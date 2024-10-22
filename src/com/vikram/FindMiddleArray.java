package com.vikram;
//Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.
import java.util.Arrays;

public class FindMiddleArray {
	
	public static void main(String[] args) {
		
		int[] array = {20,40,10,23,56,78,90,15};
		
		middle(array);
		
	}
	
	public static int[] middle(int[] array) {
		System.out.println("Given Array through Input is: ");
		System.out.println(Arrays.toString(array));
		if(array.length<=2) {
			return new int[0];
		}
		
		int[] middleArray = new int[array.length-2];
		int index = 1;
		
		while(index<array.length-1) {
			middleArray[index-1] = array[index];
			index++;
		}
		System.out.println("Middle Array of Given Array is: ");
		System.out.println(Arrays.toString(middleArray));
		return middleArray;
	}
	
	

}
