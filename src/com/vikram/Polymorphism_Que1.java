/*
Create an interface Shape with a method calculateArea(). Implement this interface with classes Circle, Rectangle, and Triangle. 
Each class should have its own implementation of calculateArea(). Demonstrate polymorphism by calling calculateArea() on different shape objects.
*/

package com.vikram;

interface Shape1 {
	
	 double calculateArea();
	
}

class Circle1 implements Shape1{

	private double radius;
	
	public Circle1(double radius) {
		this.radius=radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	
}

class Rectangle1 implements Shape1{

	private double length;
	private double width;
	
	public Rectangle1(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	@Override
	public double calculateArea() {
		return length*width;
	}
	
}

class Triangle1 implements Shape1{

	private double base;
	private double height;
	
	public Triangle1(double base, double height) {
		this.base=base;
		this.height=height;
	}
	
	@Override
	public double calculateArea() {
		return 0.5*(base*height);
	}
	
}




public class Polymorphism_Que1 {
   
	public static void main(String[] args) {
		
		Circle1 circle = new Circle1(20);
		Rectangle1 rectangle=new Rectangle1(20, 30);
		Triangle1 triangle = new Triangle1(10, 15);
		
		System.out.println("circleArea : "+ circle.calculateArea());
		System.out.println("rectangleArea : "+ rectangle.calculateArea());
		System.out.println("triangleArea : "+ triangle.calculateArea());
		
	}
	
}
