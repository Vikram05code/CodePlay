package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCaseUsingStream {
	
	public static List<String> convertToUpperCase(List<String> list) {
		return list.stream().map(String::toUpperCase).collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "python", "program", "coding", "springboot");
		System.out.println(convertToUpperCase(list));
	}

}
