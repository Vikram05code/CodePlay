package com.vikram;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MakeSetObjectReadOnly {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();

		for (int i = 0; i <= 5; i++) {
			numbers.add(i);
		}
		System.out.println("numbers in starting : ");
		numbers.forEach(System.out::println);

		numbers.remove(5);

		System.out.println("numbers after one object removal : ");
		numbers.forEach(System.out::println);

		try {
			numbers = Collections.unmodifiableSet(numbers);
			numbers.remove(4);
			System.out.println("numbers after made read only");
			numbers.forEach(System.out::println);
		} catch (UnsupportedOperationException unsupportedOperationException) {
			System.out.println("Exceptions is " + unsupportedOperationException);
		} finally {
			System.out.println(numbers.contains(4));
			System.out.println("Numbers is now read only");
		}

	}

}
