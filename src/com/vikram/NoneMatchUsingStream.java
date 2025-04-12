package com.vikram;

import java.util.Arrays;
import java.util.List;

public class NoneMatchUsingStream {
	
	public static boolean checkNegativeNumbers(List<Integer> list) {
		return list.stream().noneMatch(n->n<0);
	}
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,5,10,15,-7,20);
		
		System.out.println(checkNegativeNumbers(list));
	}

}
