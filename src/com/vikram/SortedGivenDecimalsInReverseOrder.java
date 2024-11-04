package com.vikram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedGivenDecimalsInReverseOrder {
	
	public static void main(String[] args) {
		List<Double> decimaList = Arrays.asList(24.5, 13.8, 50.2, 22.6, 90.7, 50.5, 75.7);
		List<Double> sortedList = decimaList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		sortedList.forEach(System.out:: println);
	}

}
