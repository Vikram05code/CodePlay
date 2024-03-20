package com.vikram;

import java.util.Scanner;

public class MaxValueInArray {

	  public static void main(String[] args) {
		  
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter size of Array: ");
		  int n=scan.nextInt();
		  int[] arr = new int[n];
		  
		  for(int i=0; i<arr.length; i++) {
			  System.out.print("Enter a number: ");
			  arr[i] = scan.nextInt();
		  }
		  
		  int max = Integer.MIN_VALUE;
		  
		  for(int i=0; i<arr.length; i++) {
			  if(arr[i]>max) {
				  max=arr[i];
			  }
		  }
		  
		 System.out.println("Maximum value in Array : "+max);
		  
		  
	  }
}
