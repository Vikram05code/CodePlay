package com.vikram;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayListToLinkedListUsingStream {
	
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(25,34,65,87,19,24,89,31);
		System.out.println("Given ArrayList: "+numberList);
		
		LinkedList<Integer> linkedList = numberList.stream().collect(Collectors.toCollection(LinkedList::new));
		System.out.println("Converted ArrayList to LinkedList using Stream API : "+linkedList);
		
	}

}


