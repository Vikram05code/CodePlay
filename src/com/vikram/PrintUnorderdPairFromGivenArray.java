package com.vikram;
//Create a function which prints to the console unordered pair from given array
public class PrintUnorderdPairFromGivenArray {

	public static void main(String[] args) {
		int[] array = {2,4,3,1,8,9,5};
		PrintUnorderdPairFromGivenArray printUnorderdPairFromGivenArray = new PrintUnorderdPairFromGivenArray();
		printUnorderdPairFromGivenArray.printUnorderedPair(array);
	}
	
	public void printUnorderedPair(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				System.out.print(array[i]+""+array[j]);
				System.out.print(" ");
				//Time Complexity: O(N^2)
			}
		}
	}
	
}
