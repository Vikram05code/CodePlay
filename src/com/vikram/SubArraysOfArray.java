package com.vikram;

public class SubArraysOfArray {

	public static void main(String[] args) {
		
		int[] nums = {6,7,4,12,8,10,5,14};
		int n=nums.length;
		
		for(int si=0; si < n; si++) {
			
			for(int ei=si; ei<n; ei++) {
				
				for(int k=si; k<=ei; k++) {
					System.out.print(nums[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	
}
