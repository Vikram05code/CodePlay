package com.vikram;
//Given a list of strings, sort them according to increasing order of their length
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringOnIncreasingLength {
	
	public static void main(String[] args) {
		List<String> listOfString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		List<String> sortedStrings = listOfString.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		sortedStrings.forEach(System.out::println);
	}

}

