package com.vikram;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayToArrayList {
	
	public static void main(String[] args) {
		String[] nameArray = {"Rohit","Rahul","Ram","Sohan","Prateek"};
		List<String> nameList = new ArrayList<>();
		Collections.addAll(nameList, nameArray);
		System.out.println(nameList);
	}

}