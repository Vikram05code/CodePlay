package com.vikram;

import java.util.Arrays;
import java.util.List;

public class SumOfElementsUsingStream {
	
	public static int sumOfElements(List<Integer> list) {
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,23,14,56,10,27,5,15);
		System.out.println(sumOfElements(list));
	}

}
