package com.vikram;
//Given a list of integers, find maximum and minimum of those numbers?
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxMinFromListUsingStream {
	
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(23,15,28,13,29,10,40,45,18,5,55,2);
		Integer max = numberList.stream().max(Comparator.naturalOrder()).get();
		Integer min = numberList.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Maximum Number in Given Number List is "+max);
		System.out.println("Minimum Number in Given Number List is "+min);
	}

}
