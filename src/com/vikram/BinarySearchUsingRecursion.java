package com.vikram;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		
		int[] nums = {12,13,15,17,19,24,27,34,37,39};
		int target = 27;
		int left=0;
		int right=nums.length-1;
		int result = binaryRecursive(nums, target, left, right);
		
		if(result != -1) {
			System.out.println("Element found at index : "+result);
		}
		else {
			System.out.println("Element is not found");
		}
		
	}

	public static int binaryRecursive(int[] nums, int target, int left, int right) {
		
		while(left<=right) {
		int mid=(left+right)/2;
		
		if(nums[mid] == target) {
			return mid;
		}
		else if(nums[mid]>target) {
			right=mid-1;
			return binaryRecursive(nums, target, left, right);
		}
		else {
			left=mid+1;
			return binaryRecursive(nums, target, left, right);
		}
		
		}
		
		return -1;
	}
	
	
}
