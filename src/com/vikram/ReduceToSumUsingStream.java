package com.vikram;

import java.util.Arrays;
import java.util.List;

public class ReduceToSumUsingStream {
	
	public static Integer reduceToSum(List<Integer> list) {
		return list.stream().reduce(0,Integer::sum);
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(20,5,10,12,40,27,16,23,46);
		System.out.println(reduceToSum(list));
		
	}

}
