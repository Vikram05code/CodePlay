package com.vikram;

import java.util.Arrays;
import java.util.List;

public class CountElementsUsingStream {
	
	public static Long countElements(List<Integer> list) {
		return list.stream().filter(n-> n > 10).count();
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20,10,12,26,23,10,5,15,8,9);
		System.out.println(countElements(list));
	}

}
