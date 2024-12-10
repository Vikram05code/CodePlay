package com.vikram;
//Given an array arr of non-negative numbers. The task is to find the first equilibrium point in an array. 
//The equilibrium point in an array is an index (or position) such that the sum of all elements before that index is the same as the sum of elements after it.
public class EquilibriumPointInArray {
	
	public static int equilibriumPoint(int arr[]) {
        int totalSum=0;
        int leftSum=0;
        for(int num : arr){
            totalSum+=num;
        }
        
        for(int i=0; i<arr.length; i++){
            totalSum-=arr[i];
            if(leftSum==totalSum){
                return i+1;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
	
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 2, 2};
		
		System.out.println("Equilibrium Point in given array  is "+equilibriumPoint(arr) );
	}
       
}
