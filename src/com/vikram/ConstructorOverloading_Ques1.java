/*Write a Java class Employee with fields name, age, address and salary. Implement constructor overloading with one constructor
  initializing name and age, another initializing name,  address and salary, and another initializing all fields.
 */


package com.vikram;


class Employee {
	
	private String name;
	private int age;
	private String address;
	private int salary;
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
		
		System.out.println("Name: "+name +", "+ "Age: "+age);
		System.out.println("--------------------------------------------------------------");
	}
	
	public Employee(String name, String address, int salary) {
		this.name=name;
		this.address=address;
		this.salary=salary;
		System.out.println("Name: "+name +", "+ "Address: "+address+", "+ "salary: "+salary);
		System.out.println("--------------------------------------------------------------");
	}
	
	public Employee(String name, int age, String  address, int salary) {
		this.name=name;
		this.address=address;
		this.salary=salary;
		System.out.println("Name: "+name +", "+ "Age: "+age +", "+ "Address: "+address+", "+ "salary: "+salary);
		System.out.println("--------------------------------------------------------------");
	}
	
}

public class ConstructorOverloading_Ques1 {
    
	 public static void main(String[] args) {
		 
		 Employee employee1 = new Employee("Virat", 35);
		 Employee employee2 = new Employee("Virat", "RCB", 1500000000);
		 Employee employee3 = new Employee("Virat",35,  "RCB", 1500000000);
		 
	 }
}
