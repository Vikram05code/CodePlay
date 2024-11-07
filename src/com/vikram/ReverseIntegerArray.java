package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
	
	public static void main(String[] args) {
		int[] array = new int[] {20,30,40,16,27,35,29,19,25};
		int[] reverseArray = IntStream.rangeClosed(1, array.length).map(i->array[array.length-i]).toArray();
		System.out.println(Arrays.toString(reverseArray));
		
	}

}
