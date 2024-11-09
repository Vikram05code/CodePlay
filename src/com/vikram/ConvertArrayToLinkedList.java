package com.vikram;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ConvertArrayToLinkedList {
	
	public static void main(String[] args) {
		Integer[] array = {5,10,12,14,20,24,30};
		System.out.println("Given Array: "+Arrays.toString(array));
	    LinkedList<Integer> linkedList = new LinkedList<>();
	    //Append all elements of array to linked list using Collections.addAll() method
	    Collections.addAll(linkedList, array);
	    System.out.println("Converted Array to LinkedList using addAll method: "+linkedList);
	    
	}

}
