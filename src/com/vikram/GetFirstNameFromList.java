package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetFirstNameFromList{
	
	public static List<String> getFirstName(List<String> list){
		List<String> firstNameList = list.stream().map(name->name.split(" ")[0]).collect(Collectors.toList());
	  return firstNameList;
	}
	
	public static void main(String[] args) {
		List<String> fullNames = Arrays.asList("Vikram Sharma", "Rohit Sharma", 
				"Rahul Sharma", "Virat Kohli", "Abhishek Sharma");
		System.out.println(getFirstName(fullNames));
	}

}
