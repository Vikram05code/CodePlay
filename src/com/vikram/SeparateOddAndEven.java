package com.vikram;
//Given a list of integers, separate odd and even numbers?
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class SeparateOddAndEven {
	
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<Boolean, List<Integer>> oddEvenNumMap = listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
//		Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumMap.entrySet();
//		
//		for(Entry<Boolean, List<Integer>>  entry : entrySet) {
//			System.out.println("---------------------------------------------------------------------");
//			if(entry.getKey()) {
//				System.out.println("It's a even number");
//			}else {
//				System.out.println("It's a odd number");
//			}
//			System.out.println("----------------------------------------------------------------------");
//			List<Integer> list = entry.getValue();
//			
//			for(int i : list) {
//				System.out.println(i);
//			}
//		}
		
		List<Integer> evenNumbers= oddEvenNumMap.get(true);
		List<Integer> oddNumbers = oddEvenNumMap.get(false);
		System.out.println("Even Numbers : "+ evenNumbers);
		System.out.println("Odd Numbers : "+ oddNumbers);

		
		
	}

}
