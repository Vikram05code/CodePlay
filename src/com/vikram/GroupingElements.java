package com.vikram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User {
	private Integer age;
	private String name;

	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}

public class GroupingElements {

	public static Map<Integer, List<User>> groupingByAge(List<User> list) {
		return list.stream().collect(Collectors.groupingBy(User::getAge));
	}

	public static void main(String[] args) {
		List<User> usersList = Arrays.asList(new User("Rohit", 27), new User("Vikram", 27), new User("Abhishek", 27),
				new User("Ritu", 31), new User("Rahul", 31), new User("Monu", 26));

		System.out.println(groupingByAge(usersList));
	}

}
