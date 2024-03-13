/*Given an array of integers and a target sum, can you write a Java program to find all pairs of elements in the array that sum up to the given target.
  If the array is [3, 4, 8, 1, 12, 9] and the target sum is 10, what are the pairs of elements that satisfy this condition?
 */

package com.vikram;

import java.util.Arrays;

public class PairSum {

	
	
    public static void main(String[] args) {
    	
    	int[] input = {1, 3, 4, 8, 9, 10, 5};
    	int targetSum = 10;
    
        PairSum.checkSum(input, targetSum);
    	
    }
    
    public static void checkSum(int[] arr, int target) {
    	
    	Arrays.sort(arr);
    	int left = 0;
    	int right = arr.length -1;
    	while(left<right) {
    		int sum=arr[left]+arr[right];
    		if(sum==target) {
    			System.out.println(arr[left]+", "+arr[right]);
    			left++;
    			right--;
    			
    		}else if(sum<target) {
    			left++;
    		}
    		else {
    			right--;
    		}
    	}
    	
    	
    }
    
    
}
