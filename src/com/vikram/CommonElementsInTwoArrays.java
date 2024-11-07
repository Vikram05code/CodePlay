package com.vikram;
//How do you find common elements between two arrays
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInTwoArrays {
	
	public static void main(String[] args) {
		List<Integer> listOfIntegers1= Arrays.asList(12,29,16,17,20,39,38,40);
		List<Integer>listOfIntegers2= Arrays.asList(20,40,17,18,20,75,45,38);
		List<Integer> commonIntegers = listOfIntegers1.stream().filter(listOfIntegers2::contains).collect(Collectors.toList());
		commonIntegers.forEach(System.out::println);
	}

}
