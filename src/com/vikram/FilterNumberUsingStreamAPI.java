package com.vikram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumberUsingStreamAPI {
	
	public static List<Integer> filterNumber(List<Integer> numberList){
		
		List<Integer> evenNumberList = numberList.stream().filter((num)->num % 2==0).collect(Collectors.toList());
		
		return evenNumberList;
	}
	
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10,20,30,15,13,26,17,5,18,7,15,25);
		System.out.println(filterNumber(numberList));
	}

}
