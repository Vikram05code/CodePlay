package com.vikram;

import java.util.Arrays;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int[] array = {1, 1, 2, 2, 3, 4, 5};
		removeDuplicates(array);
	}
	
	public static int[] removeDuplicates(int[] arr) {
		int n=arr.length;
	    int[] newArray = new int[n];
	    int index=0;
	    for(int i=0; i<n; i++){
	        Boolean isDuplicate=false;
	        for(int j=i+1; j<n; j++){
	            if(arr[i]==arr[j]){
	                isDuplicate=true;
	                break;
	            }
	        }
	        if(!isDuplicate){
	            newArray[index++]=arr[i];
	        }
	    }
	    return Arrays.copyOf(newArray, index);
	  }
	
}
