package com.vikram;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConvertListToSet {
	
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(25,34,65,87,19,24,89,31);
		System.out.println("Given ArrayList: "+numberList);
		//First way to convert in set
		Set<Integer> hashset = new HashSet<>();
		for(Integer number : numberList) {
			hashset.add(number);
		}
		System.out.println("Converted arrayList to set: "+hashset);
		
		//Second way to convert in set
		Set<Integer> hashset1 = new HashSet<>(numberList);
		System.out.println("list to set using constructor: "+hashset1);
		
		//convert into list to treeSet
		Set<Integer> treeSet = new TreeSet<>(numberList);
		System.out.println("list to Treeset using constructor: "+treeSet);
		
		//using addAll method
		Set<Integer> hashSet2 = new HashSet<>();
		hashSet2.addAll(numberList);
		System.out.println("Converted List to set using addAll method : "+hashSet2);
		
		Set<Integer> treeSet1 = new TreeSet<>();
		treeSet1.addAll(numberList);
		System.out.println("Converted List to Treeset using addAll method : "+treeSet1);
		
		//convert to set using stream api
		Set<Integer> set = numberList.stream().collect(Collectors.toSet());
		System.out.println("Converted List to set using stream api : "+set);
		
	}
	
	

}

