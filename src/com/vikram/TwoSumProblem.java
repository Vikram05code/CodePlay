package com.vikram;

import java.util.HashMap;
import java.util.Map;

/*
  Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
 */

public class TwoSumProblem {

	
	public static void main(String[] args) {
		
		int[] nums = {2, 7, 11, 15};
		int target = 26;
		int[] result = checkTwoSum(nums, target);
		if(result != null) {
			System.out.println("["+result[0]+","+result[1]+"]");
		}
		else {
			System.out.println("No Solutions found");
		}
	}
	
	
	public static int[] checkTwoSum(int[] nums, int target) {
		
		int length = nums.length-1;
		
		int[] solution;
		
		Map<Integer, Integer> hashMap = new HashMap<>();
		
		for(int i=0; i<=length; i++) {
			
			int complement = target-nums[i];
			if(hashMap.containsKey(complement)) {
				return new int[] {hashMap.get(complement),i};
			}
			hashMap.put(nums[i], i);
			
		}
		return null;
	}
	
}

	
