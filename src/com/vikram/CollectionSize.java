//Java Program to Get the Size of Collection and Verify that Collection is Empty

package com.vikram;

import java.util.LinkedList;
import java.util.List;

public class CollectionSize {

	public static void main(String[] args) {
		
		List<Integer> lists = new LinkedList<Integer>();
		
		//add integer values in the lists
		lists.add(29);
		lists.add(26);
		lists.add(10);
		lists.add(140);
		lists.add(176);
		lists.add(20);
		
		System.out.print("The elements in the Lists : ");
		System.out.println(lists);
		
		//size of Collections
		System.out.println("Size of the Collections: "+lists.size());
		
		//check if list is empty
		System.out.println("Is the list empty : "+lists.isEmpty());
		
		//clear Collections
	    lists.clear();
	    
	    //Printing the new lists
	    System.out.println(lists);
	    
	  //check if list is empty
	  		System.out.println("Is the list empty : "+lists.isEmpty());
		
	}
	
	
}
