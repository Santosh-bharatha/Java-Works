package com.composition;

public class Car extends Vehicle {
	
	private int doors;
	private int engineCapicity;

	public Car(String name, int doors, int engineCapacity) {
		super(name);
		this.doors = doors;
		this.engineCapicity = engineCapacity;
	}
	
	

}
