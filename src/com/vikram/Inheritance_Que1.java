package com.vikram;

//Write a Java program demonstrating inheritance where you have a superclass Shape and subclasses Circle and Rectangle. Implement methods to calculate area and perimeter for each shape.

class Shape {
	
	public double area() {
		
		return 0.0;
	}
	
	public double perimeter() {
		
		return 0.0;
	}
	
}

class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	@Override
	public double area() {
		
		double circleArea = Math.PI*radius*radius;
		System.out.println("circleArea="+circleArea);
		return circleArea;
	}
	
	public double perimeter() {
		
		double circlePerimeter = 2*(Math.PI*radius);
		System.out.println("circlePerimeter="+circlePerimeter);
		return circlePerimeter;
	}
	
}


class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.width=width;
		this.length=length;
	}
	
	@Override
	public double area() {
		
		double rectangleArea=length*width;
		System.out.println("rectangleArea="+rectangleArea);
		return rectangleArea;
	}
	
	@Override
	public double perimeter() {
		
		double rectanglePerimeter = 2*(length+width);
		System.out.println("rectanglePerimeter="+rectanglePerimeter);
		return rectanglePerimeter;
	}
	
}




public class Inheritance_Que1 {

	public static void main(String[] args) {
		
		Circle circle = new Circle(14);
		circle.area();
		circle.perimeter();
		
		Rectangle rectangle = new Rectangle(15, 20);
		rectangle.area();
		rectangle.perimeter();
		
	}
	
}


