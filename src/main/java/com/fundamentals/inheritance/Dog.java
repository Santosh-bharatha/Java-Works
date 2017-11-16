package com.fundamentals.inheritance;

public class Dog extends Animal{

	public Dog(String name, int brian, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs= legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
		
	}
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}

	public void walk(){
		System.out.println("dog.walk()");
		super.move(5);
	}

	public void run(){
		System.out.println("Dog runs");
		move(10);
	}
	private void chew() {
    System.out.println("Chew got called");		
	}
	
	@Override
	public void move(int speed){
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
		
	}

	private void moveLegs(int speed) {
System.out.println("Dog moves its legs at Speed"+speed);		
	}
	
	

}
