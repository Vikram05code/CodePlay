package com.vikram;

public class AddTwoComplexNumber {

	int real, img;

	public AddTwoComplexNumber(int r, int i) {
		this.real = r;
		this.img = i;
	}

	public void showComplexNumber() {
		System.out.println(real +"+ " +"i" + img);
	}

	public static AddTwoComplexNumber add(AddTwoComplexNumber c1, AddTwoComplexNumber c2) {

		AddTwoComplexNumber addTwoComplexNumber = new AddTwoComplexNumber(0, 0);
		addTwoComplexNumber.real = c1.real + c2.real;
		addTwoComplexNumber.img = c1.img + c2.img;

		return addTwoComplexNumber;
	}

	public static void main(String[] args) {

		AddTwoComplexNumber addTwoComplexNumber1 = new AddTwoComplexNumber(10, 5);
		System.out.println("First Complex Number : ");
		addTwoComplexNumber1.showComplexNumber();

		AddTwoComplexNumber addTwoComplexNumber2 = new AddTwoComplexNumber(8, 6);
		System.out.println("Second Complex Number : ");
		addTwoComplexNumber1.showComplexNumber();

		AddTwoComplexNumber result = add(addTwoComplexNumber1, addTwoComplexNumber2);
		System.out.println("Addition of two Complex Number : ");
		result.showComplexNumber();
	}

}
