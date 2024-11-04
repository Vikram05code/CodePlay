package com.vikram;
//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringWithPrefixAndSufix {
	
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Java", "Spring","SpringBoot","Hibernate","SpringData","SpringRest");
		String changedList = stringList.stream().collect(Collectors.joining(", ", "[", "]"));
		System.out.println(changedList);
	}

}
