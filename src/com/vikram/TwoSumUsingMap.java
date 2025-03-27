package com.vikram;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMap {
	
	public static int[] findTwoSum(int[] arr, int target) {
		
		Map<Integer, Integer> hashMap = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			int complement = target - arr[i];
			if(hashMap.containsKey(complement)) {
				return new int[] {hashMap.get(complement), i};
			}else {
				hashMap.put(arr[i], i);
			}
		}
		
		
		return new int[0];
	}
	
	public static void main(String[] args) {
		int[] arr = {12,14,10,18,6,17,10};
		int target = 30;
		int[] result = findTwoSum(arr, target);
		if(result.length>=2) {
			System.out.println("indices:"+result[0]+","+result[1]);
		}else {
			System.out.println("No valid pair found");
		}
	}

}
