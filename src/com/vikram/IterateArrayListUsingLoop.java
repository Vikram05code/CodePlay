package com.vikram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterateArrayListUsingLoop {
	
	public static void iterateArrayList(List<Integer> list) {
		//using for loop
		System.out.println("Using for Loop");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		//using while loop
		System.out.println();
		System.out.println("Using while Loop");
		int num = 0;
		while(num <list.size()) {
			System.out.print(list.get(num)+" ");
			num++;
		}
		System.out.println();
		System.out.println("Using advance for Loop");
		for(int item : list) {
			System.out.print(item+" ");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>(Arrays.asList(23,76,12,65,23,12,60,5,35,65,24));
		
		iterateArrayList(list);
	}

}
