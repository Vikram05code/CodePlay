package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
	
	public static List<String> peekUsingStream(List<String> lists) {
		List<String> names = lists.stream().peek(name->System.out.println("Original:"+name))
				.filter(name->name.length()>5)
				.peek(name->System.out.println("After Filter:"+name))
				.collect(Collectors.toList());
		
		return names;
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vikram", "Rohit", "Rahul", "Abhishek", "Ashutosh", "Raj", "Monu");
		System.out.println(peekUsingStream(names));
	}

}
