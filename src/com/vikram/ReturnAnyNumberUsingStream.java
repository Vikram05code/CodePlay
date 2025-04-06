package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReturnAnyNumberUsingStream {
	
	public static void returnAnyNum(List<Integer> list) {
		Optional<Integer> anyNum =  list.stream().findAny();
		anyNum.ifPresentOrElse((num)->System.out.println("Number found : "+num), ()->System.out.println("List is empty"));
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(70,12,25,17,10,25,4,20);
		returnAnyNum(list);
	}

}
