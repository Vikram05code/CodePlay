package com.vikram;

public class LongestContinuousSequence {
	
	public static int getLongestContinuousSequence(int[] arr) {
		
		int maxCount=0;
		int currentCount=0;
		int maxZeroIndex=-1;
		int lastZeroIndex=-1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				currentCount++;
			}else {
				if(currentCount > maxCount) {
					maxCount = currentCount;
					maxZeroIndex = lastZeroIndex;
				}
				currentCount=0;
				lastZeroIndex=i;
				
			}
			if(currentCount>maxCount) {
				maxZeroIndex = lastZeroIndex;
			}
			if(maxZeroIndex == -1 && lastZeroIndex != -1) {
				maxZeroIndex = lastZeroIndex;
			}
			
		}
		
		
		return maxZeroIndex;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getLongestContinuousSequence(new int[]{0,1,0,1,1,0,1,1,1,0,1})); 
	    System.out.println(getLongestContinuousSequence(new int[]{1,1,1,0,1})); 
	    System.out.println(getLongestContinuousSequence(new int[]{1,1,1,1}));
	    System.out.println(getLongestContinuousSequence(new int[]{0,1,1,1,0,1,1}));
	}

}
