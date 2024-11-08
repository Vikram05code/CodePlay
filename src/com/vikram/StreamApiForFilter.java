package com.vikram;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiForFilter {

	public static void main(String[] args) {

		/*
		// Filtering collections of object using traditional way
		 
		List<Integer> list = List.of(10, 8, 12, 16, 17, 6, 9, 7, 15);

		System.out.println(list);
		// filter out even number from this list
		List<Integer> list1 = new ArrayList<>();

		for (Integer i : list) {
			if (i % 2 == 0) {
				list1.add(i);
			}
		}

		System.out.println(list1);
*/
		
		
		//Filterning Collections of objects using Stream Api
		//Filter out even numbers from this list
		List<Integer> list = List.of(10, 8, 12, 16, 17, 6, 9, 7, 15);
		
//		Stream<Integer> streamList = list.stream();
//	    List<Integer> filterList =	streamList.filter((i->i%2==0)).collect(Collectors.toList());
//		System.out.println(filterList);
		
		List<Integer> filterList = list.stream().filter((i->i%2==0)).collect(Collectors.toList());
		System.out.println(filterList);
		
		
		//filter out those numbers from this list which is greater than 20
		List<Integer> list3 = List.of(12,24,15,20,25,15,50,18,19,21,28,30,10);
		List<Integer> filteredList = list3.stream().filter((i->i>20)).collect(Collectors.toList());
		System.out.println(filteredList);
		
		
		//filter out those names which starts with A
		List<String> list4 = new ArrayList<>();
		list4.add("Rohit");
		list4.add("Aman");
		list4.add("Abhishek");
		list4.add("Aarohi");
		list4.add("Amit");
		list4.add("Prateek");
		list4.add("Rohan");
		list4.add("Aakash");
		
		System.out.println(list4);
		
	List<String> filteredList3 =	list4.stream().filter(str->str.startsWith("A")).collect(Collectors.toList());
	System.out.println(filteredList3);
	filteredList3.forEach(str->System.out.println(str));
	
	
	//use of map() in stream Api
		List<Integer> list6 = List.of(10,11,7,18,8,12,13,5,6);
		System.out.println("Before using map: "+list6);
		//return square of every number using map
	List<Integer> list7 = list6.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println("After using map: "+list7);
	list7.forEach(num->System.out.println(num));
			
	}
}

