package com.vikram;
//Given an array, write a function to get first, second best scores from the array and return it in new array.
import java.util.Arrays;

public class FirstAndSecondHigestScoreInMatch {
	
	public static void main(String[] args) {
		int[] array = {84,85,86,87,85,90,85,83,23,125,84,1,2,0};
		findFirstAndSecondHigest(array);
		
	}
	
	public static int[] findFirstAndSecondHigest(int[] array) {
		int firstHigest = Integer.MIN_VALUE;
		int secondHigest=Integer.MIN_VALUE;
		System.out.println("Given Array of Cricket Match Score of Players in a match : "+Arrays.toString(array));
		for( Integer score : array) {
			if(score>firstHigest) {
				secondHigest=firstHigest;
				firstHigest=score;
			}else if(score>secondHigest && score<firstHigest) {
				secondHigest=score;
			}
		}
		int[] myArray = {firstHigest, secondHigest};
		System.out.println("First and Second Higest Score of Player in the match : "+Arrays.toString(myArray));
		return myArray;
	}

}
