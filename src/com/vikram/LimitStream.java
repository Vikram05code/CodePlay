package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitStream {

	public static List<Integer> limitedOutPut(List<Integer> list) {
		List<Integer> limitedList = list.stream().limit(3).collect(Collectors.toList());

		return limitedList;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 15, 20, 5, 25);
		System.out.println(limitedOutPut(list));

	}
}
