package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipElements {
	
	public static List<Integer> skipFirstThreeElements(List<Integer> list){
		List<Integer> restOfNumberList = list.stream().skip(3).collect(Collectors.toList());
		
		return restOfNumberList;
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 15, 20, 5, 25);
		System.out.println(skipFirstThreeElements(list));
	}

}
