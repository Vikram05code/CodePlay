//Java Program to Compare Elements in a Collection

package com.vikram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCompareElements {

	public static void main(String[] args) {
		
		//Initializing List
		List<Integer> lists = new ArrayList<Integer>();
		
		//Adding elements in the lists
		lists.add(7);
		lists.add(19);
		lists.add(6);
		lists.add(20);
		lists.add(30);
		
		//minimum in the lists
		int min = Collections.min(lists);
		
		//max in the lists
		int max = Collections.max(lists);
		
		if(min == max) {
			System.out.println("All elements are equal");
		}
		else {
			System.out.println("Max value in the list : "+max);
			System.out.println("Min value in the list : "+min);
			
			
		}
		
	}
	
}
