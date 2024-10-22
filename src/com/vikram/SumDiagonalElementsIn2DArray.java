package com.vikram;
//Given 2D array calculate the sum of diagonal elements.
import java.util.Arrays;

public class SumDiagonalElementsIn2DArray {
	
	public static void main(String[] args) {
		int[][] array = {{1,2,8},
				                 {4,2,6},
				                 {7,8,9}};
		diagonalSum(array);
	}
	
	public static void diagonalSum(int[][] array) {
		System.out.println("Given 2D Array is : "+Arrays.deepToString(array));
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum=0;
		int numRow=array.length;
		for(int i=0; i<numRow; i++) {
			primaryDiagonalSum+=array[i][i];
			secondaryDiagonalSum+=array[i][numRow-1-i];
		}
		System.out.println("Sum of primaryDiagonalSum Elements is : "+primaryDiagonalSum);
		System.out.println("Sum of primaryDiagonalSum Elements is : "+secondaryDiagonalSum);

		
	}

}
