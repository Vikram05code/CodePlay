package com.vikram;

public class SwapFirstAndLastDigit {

	public static void main(String[] args) {
		int number = 123456;
		int originalNum = number;
		int totalDigit = (int) (Math.log10(number) + 1);
		int lastDigit = number % 10;
		int firstDigit = (int) (number / Math.pow(10, totalDigit - 1));
		int middlePart = (number % (int) (Math.pow(10, totalDigit - 1))) / 10;
		int newNumber = lastDigit * (int) Math.pow(10, totalDigit - 1) + middlePart * 10 + firstDigit;
		System.out.println("Original Number: " + originalNum);
		System.out.println("New Number After First and Last Digit Swap : " + newNumber);

	}

}
