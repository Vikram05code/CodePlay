package com.vikram;
//How do you find frequency of each element in an array or a list?
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfEachElement {
	
	public static void main(String[] args) {
		List<String> stationaryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		Map<String, Long> elementCountMap = stationaryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(elementCountMap);
	}

}
