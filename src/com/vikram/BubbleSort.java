package com.vikram;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] nums = {5,2,7,6,12,9,18,15,10,16,8,20};
		System.out.println("Before Sorting: ");
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
		int temp=0;
		int size = nums.length;
		
		for(int i=0; i<size;i++) {
			
			for(int j=0; j<size-1; j++) {
				if(nums[j]>nums[j+1]) {
					temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
				
			}
			
		}
		
		System.out.println();
		
		System.out.println("After sorting: ");
		for(int number : nums) {
			System.out.print(number+" ");
		}
	}
	
}
