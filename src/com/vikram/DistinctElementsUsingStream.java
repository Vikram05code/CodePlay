package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElementsUsingStream {

	public static List<Integer> getDistinctElements(List<Integer> list){
		return list.stream().distinct().collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20,10,15,20,5,12,10,35,15);
		System.out.println(getDistinctElements(list));
	}
	
}
