package com.vikram;

public class TransposeOfSquareMatrix {
	
	public static void main(String[] args) {
		
		int[][] matrix1 = {
				                     {1,2,3,4,5},
				                     {3,6,8,9,2},
				                     {5,7,2,1,4},
				                     {3,6,8,9,5},
				                     {2,1,4,3,7},
				                     };
		
		int[][] matrix2=new int[n][n];
		transpose(matrix1, matrix2);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	static final int n=5;
	
	public static void transpose(int[][] a, int[][] b) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				b[i][j] = a[j][i];
			}
		}
		
	}
	
	

}
