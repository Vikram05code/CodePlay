package com.vikram;

import java.util.ArrayList;
import java.util.List;

public class InsertElementAtSpecificIndexInArrayList {
	
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(12);
		numberList.add(22);
		numberList.add(15);
		numberList.add(34);
		numberList.add(45);
		
		System.out.println("NumberList Given by user: "+numberList);
		numberList.set(2, 25);
		System.out.println("NumberList After performing set operation at index 2 : "+numberList);


	
	}

}
