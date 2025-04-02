package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListUsingStream {
	
	public static List<Integer> listSorting(List<Integer> list){
		
		return list.stream().sorted().collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,6,15,5,36,21,8,20);
		System.out.println(listSorting(list));
	}

}
