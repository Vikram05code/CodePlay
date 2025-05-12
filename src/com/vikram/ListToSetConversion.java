package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetConversion {

	public static Set<Integer> convertListToSet(List<Integer> list){
		Set<Integer> setOfNumbers = list.stream().collect(Collectors.toSet());
		
		return setOfNumbers;
	}
	
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 15, 20, 5, 25);
		System.out.println(convertListToSet(list));
	}
	
	
}
