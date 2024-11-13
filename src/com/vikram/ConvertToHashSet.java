package com.vikram;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ConvertToHashSet {
	
	public static void main(String[]  args) {
		Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 };
		
		Set<Integer> hashSet = new  HashSet<Integer>(Arrays.asList(arr));
		System.out.println("Hashset: "+hashSet);
		
		
		
	}

}
