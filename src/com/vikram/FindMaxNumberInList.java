package com.vikram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxNumberInList {

	public static int findMaxNumber(List<Integer> list) {

		Integer maxNumber = list.stream().max(Comparator.naturalOrder()).orElse(Integer.MIN_VALUE);

		return maxNumber;
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(23, 34, 18, 20, 16, 19, 38, 50);
		System.out.println(findMaxNumber(list));
	}

}
