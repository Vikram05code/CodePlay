package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenNestedList {
	
	public static List<Integer> flatten(List<List<Integer>> nestedLists){
		return nestedLists.stream().flatMap(List::stream).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<List<Integer>> nestedLists = Arrays.asList(Arrays.asList(5,10,12,6,20),
				Arrays.asList(55,30,2,16,40),Arrays.asList(65,60,32,76,40));
		System.out.println(flatten(nestedLists));
	}

}
