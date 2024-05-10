//How to Make a Collection Read-Only in Java?


package com.vikram;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionsReadOnly {

	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<>();
		
		for(int i=1; i<8; i++) {
			numbers.add(i);
		}
		
		//printing numbers
		numbers.stream().forEach(System.out::print);
		
		numbers.remove(7);
		
		//printing after Performing operation
		
		numbers.stream().forEach(System.out::print);
		
		//Set is by default Readable and writable
		
		//now I am going to make it Read Only
		
		try {
		
		numbers = Collections.unmodifiableSet(numbers);
		
		//It will throw exception
		numbers.remove(6);
		
		
		}
		catch(UnsupportedOperationException unsupportedOperationException) {
			System.out.println(unsupportedOperationException);
		}
		
		
	}
	
	
}
