/*Given an array nums and a value val, remove all instances of that 
value in-place and return the new length of the array. Do not allocate extra 
space for another array. You must modify the input array in-place with O(1) 
extra memory.*/

package com.vikram;

public class RemoveElements {
	
	public static int removeVal(int[] nums, int val) {
		int i=0;
		for( int j : nums) {
			if(j != val) {
				nums[i] = j;
				i++;
			}
		}
		return i;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {10, 12, 15, 18, 10, 5, 20};
		int val = 10;
		int newLength = removeVal(nums, val);
		System.out.println("new Length = "+newLength);
	}

}
