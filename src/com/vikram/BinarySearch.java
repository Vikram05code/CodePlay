package com.vikram;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] nums = {5, 8, 12, 14, 16, 20, 22, 24,25};
		int target = 22;
		int result = binarySearching(nums, target);
		
		if(result != -1) {
			System.out.println("Element found at index : "+ result);
		}
		else {
			System.out.println("Element not found");
		}
		
	}

	public static int binarySearching(int[] nums, int target) {
	
		int left = 0;
		int right = nums.length-1;
		
		while(left<=right) {
			
			int mid = (left+right)/2;
			
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			
		}
		return -1;
	}
	
	
}
