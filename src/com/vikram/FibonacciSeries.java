package com.vikram;

import java.util.Scanner;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		printFibonacciSeries(num);
		
		
	}

	public static void printFibonacciSeries(int num) {
	
		int firstNum = 0;
		int secondNum=1;
		System.out.print(firstNum+"  "+secondNum+" ");
		
		for(int i=2; i<num; i++) {
			int nextNum=firstNum+secondNum;
			System.out.print(nextNum+" ");
			firstNum=secondNum;
			secondNum=nextNum;
		}
		
	}

}
