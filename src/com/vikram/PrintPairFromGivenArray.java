package com.vikram;
//Create a function which prints to the console  pair from given array
public class PrintPairFromGivenArray {
	
	public static void main(String[] args) {
		int[] array = {2, 4, 1, 3, 8, 9, 5, 7};
		PrintPairFromGivenArray printPairFromGivenArray = new PrintPairFromGivenArray();
		printPairFromGivenArray.printPair(array);
	}
	
	public void printPair(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				System.out.print(array[i]+""+array[j]);
				System.out.print(" ");
				//Time complexity : O(N^2)
			}
		}
	}

}
