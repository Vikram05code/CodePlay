package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;


public class SummaryStatisticsOfList {

	public static void getSummaryStatistics(List<Integer> list) {
		IntSummaryStatistics summaryStats = list.stream().mapToInt(Integer::intValue).summaryStatistics();
		System.out.println("Max: " + summaryStats.getMax());
        System.out.println("Min: " + summaryStats.getMin());
        System.out.println("Sum: " + summaryStats.getSum());
        System.out.println("Average: " + summaryStats.getAverage());
        System.out.println("Count: " + summaryStats.getCount());
	}
	
	
	
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 15, 20, 5, 25);
		getSummaryStatistics(list);
	}
	
}
