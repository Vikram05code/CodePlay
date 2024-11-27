package com.vikram;

import java.util.HashMap;

public class CheckSubsetOfArray {
	
	public static void main(String[] args) {
		int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
		int[] b = {11, 3, 7, 1, 7};
		
		if(isSubset(a, b)) {
			System.out.println("Yes, it's subset ");
		}else {
			System.out.println("No, it's not subset ");
		}
		
	}
	
	public static boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Check if each element in array b is present in the HashMap
        for (int num : b) {
            if (!freqMap.containsKey(num) || freqMap.get(num) <= 0) {
                return false; // Element not found or not enough occurrences
            }
            // Decrement the frequency in the map
            freqMap.put(num, freqMap.get(num) - 1);
        }

        return true; // All e
    }

}
