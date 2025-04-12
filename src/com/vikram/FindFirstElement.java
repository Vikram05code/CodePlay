package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
	
	public static int findFirst(List<Integer> list) {
		 return list.stream().findFirst().orElse(0);
	}
	
	public static void main(String[] args) {
List<Integer> list = Arrays.asList(12,5,10,15,-7,20);
		
		System.out.println(findFirst(list));
	}

}
