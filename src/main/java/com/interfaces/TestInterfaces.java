package com.interfaces;

interface Drawable {
	void draw();
	static int cube(int x){
		return x*x*x;
	}
}

class Rectangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

	

}

class Circle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}

}

//https://www.javatpoint.com/interface-in-java

public class TestInterfaces {

	public static void main(String[] args) {
		Drawable shape = new Circle();
		shape.draw();
		System.out.println(Drawable.cube(3));

		Bank bank = new SBI();
		float interest = bank.rateOfInterest();

		System.out.println(bank.getClass() + " Interest :" + interest);
		
		A7 a7 = new A7();
		a7.print();
		a7.show();

	}

}

interface Printable {
	void print();
}

interface Showable extends Printable{
	void show();
}

interface Bank {
	float rateOfInterest();
}

class A7 implements Showable {

	@Override
	public void show() {
		System.out.println("Show");
	}

	@Override
	public void print() {
		System.out.println("Print");
	}

}

class SBI implements Bank {

	@Override
	public float rateOfInterest() {
		return 9.7f;
	}

}

class PNB implements Bank {

	@Override
	public float rateOfInterest() {
		return 9.15f;
	}

}
