package com.vikram;

import java.util.Arrays;
import java.util.List;

public class AllMatchUsingStream {
	
	public static boolean checkAllPositiveNum(List<Integer> list) {
		return list.stream().allMatch(n -> n >0);
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 21, 5,67,1,8,15);
		System.out.println(checkAllPositiveNum(list));
	}

}
