package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How do you remove duplicate elements from a list using Java 8 streams?

public class RemoveDuplicateElementsUsingJava8 {
	
	public static void main(String[] args) {
		List<String> listOfElements = Arrays.asList("Rohit", "Rahul","Gautam", "Vikram","Abhishek","Rohit","Rahul");
		System.out.println("With Duplicates elements : ");
		System.out.println(listOfElements);
		List<String> duplicateRemovedList = listOfElements.stream().distinct().collect(Collectors.toList());
		System.out.println("After removal of duplicates elements using Stream  : ");
		System.out.println(duplicateRemovedList);
	}

}
