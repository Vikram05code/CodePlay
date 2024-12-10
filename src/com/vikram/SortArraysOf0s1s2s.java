package com.vikram;

import java.util.Arrays;

//Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
public class SortArraysOf0s1s2s {
	
	public static void sort012(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count occurrences of 0, 1, and 2
        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else if (num == 2) count2++;
        }

        // Overwrite the array with sorted values
        int index = 0;
        while (count0-- > 0) arr[index++] = 0;
        while (count1-- > 0) arr[index++] = 1;
        while (count2-- > 0) arr[index++] = 2;
    }
	
	
	public static void main(String[] args) {
		int[] arr =  {0, 1, 2, 0, 1, 2};
		System.out.println("After Sorting Array: ");
		sort012(arr);
	System.out.println(Arrays.toString(arr));
	}

}
