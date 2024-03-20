package com.vikram;

public class ArrayIn2DForm {

	public static void main(String[] args) {
		
		int[][] arr = new int [5][6]; //syntax
		
		//set operation
		arr[1][2] =5;
		arr[0][1]=7;
		arr[0][4] = 10;
		arr[1][4] = 12;
		arr[2][4] = 20;
		
		//get operation
		
		System.out.println(arr[1][2]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][4]);
		System.out.println(arr[1][4]);
		
		//traverse 
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		
	}
	
}
