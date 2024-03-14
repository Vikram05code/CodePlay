package com.vikram;

public class ElementAppearingCase {

	public static int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int threshold = n / 4;

        for (int i = 0; i < n - threshold; i++) {
            if (arr[i] == arr[i + threshold]) {
                return arr[i];
            }
        }

        return -1; // Return -1 if no such element found
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10}; // Example array
        int result = findSpecialInteger(arr);
        if (result != -1) {
            System.out.println("The integer that occurs more than 25% of the time is: " + result);
        } else {
            System.out.println("No such integer found.");
        }
    }
	}
