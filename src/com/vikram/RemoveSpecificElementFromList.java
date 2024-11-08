package com.vikram;

import java.util.ArrayList;
import java.util.List;

public class RemoveSpecificElementFromList {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(16);
		numberList.add(20);
		numberList.add(30);
		numberList.add(21);
		numberList.add(45);
		
		System.out.println("NumberList Given by User : ");
	    System.out.println(numberList);
	   //remove elements by index
	    numberList.remove(2);
	    numberList.remove(3);
	    System.out.println("NumberList After Remove by index operation : ");
	    System.out.println(numberList);
	    //remove by using object
	    numberList.remove(new Integer(16));
	    
	    System.out.println("NumberList After Remove by object operation : ");
	    System.out.println(numberList);
	   
	    
	}

}


