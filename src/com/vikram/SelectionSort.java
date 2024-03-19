package com.vikram;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] nums = {6,4,5,12,10,8,9,11,20,15};
		int size=nums.length;
		int temp=0;
		int minIndex=-1;
		
		System.out.println("Before Sorting ");
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
		for(int i=0; i<size; i++) {
			minIndex=i;
			
			for(int j=i+1; j<size; j++) {
				if(nums[minIndex] > nums[j]) {
					minIndex=j;
				}
			}
			temp=nums[minIndex];
		   nums[minIndex] = nums[i];
		   nums[i]=temp;
			
		}
		System.out.println();
		System.out.println("After Sorting: ");
		for(int number : nums) {
			System.out.print(number+" ");
		}

	}
	
	
}
