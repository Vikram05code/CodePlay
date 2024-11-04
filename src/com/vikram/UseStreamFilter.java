package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseStreamFilter {
	
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(25, 32, 20, 65, 12, 14, 23);
		List<Integer> filterList = listOfIntegers.stream().filter(i->i%5==0).collect(Collectors.toList());
		filterList.forEach(System.out::println);
	}

}
