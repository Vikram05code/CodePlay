package com.vikram;
//Find sum of all digits of a number in Java 8?
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfNumber {
	
	public static void main(String[] args) {
		Integer num = 143256;
		Integer sumOfDigits = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sumOfDigits);
	}

}
