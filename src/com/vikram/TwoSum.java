package com.vikram;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create an array to store the indices of the two numbers
        int[] indices = new int[2];
        
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // Inner loop to find the complement of the current number
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the current pair of numbers sum up to the target
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    // If found, return the indices
                    return indices;
                }
            }
        }
        
        // If no solution is found, return an empty array
        return new int[0];
    }
    
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
}
