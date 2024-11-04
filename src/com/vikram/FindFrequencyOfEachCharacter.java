package com.vikram;
//How do you find frequency of each character in a string using Java 8 streams
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindFrequencyOfEachCharacter {
	
	public static void main(String[] args) {
		String inputString = "Java is a programming language";
		Map<Character, Long> characterCount = inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(characterCount);
	}

}
