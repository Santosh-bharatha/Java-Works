package com.abstractclass;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getName()+ "is eating");
		
	}

	@Override
	public void breath() {
		System.out.println("Breating in, breath out, repeat");
		
	}

}
