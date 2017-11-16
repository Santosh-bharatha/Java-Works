package com.fundamentals;

public class Main {

	public static void main(String[] args) {

		Car porsche = new Car();
		Car holden = new Car();
		System.out.println();
		porsche.setModel("Carrera");
		System.out.println("Model is "+ porsche.getModel());
	}
	
	public static String model(){
		System.out.println("Main Model");
		return "model";
	}

}
