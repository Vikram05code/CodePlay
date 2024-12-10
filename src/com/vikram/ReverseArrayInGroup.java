package com.vikram;
//Given an array arr of positive integers. Reverse every sub-array group of size k.
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayInGroup {
	
	static void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();

       for (int i = 0; i < n; i += k) {
           // Find the start and end of the current sub-array
           int left = i;
           int right = Math.min(i + k - 1, n - 1); // Ensure we don't go out of bounds

           // Reverse the sub-array in-place
           while (left < right) {
               Long temp = arr.get(left); 
               arr.set(left, arr.get(right)); // Use set method to update the value
               arr.set(right, temp); // Use set method to update the value
               left++;
               right--;
           }
       }
}
	
	
	public static void main(String[] args) {
		int k = 3;
		ArrayList<Long> arr= new ArrayList<Long>(Arrays.asList(1L,2L,3L,4L,5L));
		reverseInGroups(arr, k);
		System.out.println(arr);
	}

}
