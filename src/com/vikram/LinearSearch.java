package com.vikram;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] nums = {3,7,9,11,14, 18, 20,23};
		int target = 20;
		
		int result = linearSearching(nums, target);
		if(result!=-1) {
			System.out.println("Element Found at index: "+result);
		}
		else {
			System.out.println("element not found");
		}
		
	}

	public static int linearSearching(int[] nums, int target) {
		
		for(int i=0; i<nums.length; i++) {
			if(target==nums[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	
}
