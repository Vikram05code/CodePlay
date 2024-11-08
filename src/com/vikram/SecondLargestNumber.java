package com.vikram;
//Find second largest number in an integer array
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
	  List<Integer> listOfIntegers = Arrays.asList(24,37,12,28,35,69,78,50,15,70);
	  Integer secondMaxNum = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	  System.out.println(secondMaxNum);
	}

}
