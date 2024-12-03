package com.vikram;
/*You are given an array arr of positive integers. Your task is to find all the leaders in the array. 
 * An element is considered a leader if it is greater than or equal to all elements to its right. 
 * The rightmost element is always a leader. */

import java.util.ArrayList;
import java.util.Collections;

public class FindLeaderInGivenArray {
	
	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		System.out.println("Leaders in Given Array: "+leaders(arr));
	}
	
	 static ArrayList<Integer> leaders(int arr[]) {
	        // code here
	        ArrayList<Integer> leadersList = new ArrayList<>();
	        int n = arr.length;
	        int maxFromRight = arr[n-1];
	        leadersList.add(maxFromRight);
	        for(int i=n-2; i>=0; i--){
	            if(arr[i]>= maxFromRight){
	                maxFromRight=arr[i];
	               leadersList.add(maxFromRight); 
	            }
	        }
	        Collections.reverse(leadersList);
	        return leadersList;
	    }

}
