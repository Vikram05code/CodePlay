package com.vikram;
//Print first 10 even numbers
import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintFirst10EvenNumbers {
	
	public static void main(String[] args) {
		int[] first10EvenNum = IntStream.rangeClosed(1, 10).map(i -> i * 2).toArray();
		System.out.println(Arrays.toString(first10EvenNum));
	}

}

