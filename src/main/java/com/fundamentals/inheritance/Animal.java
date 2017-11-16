package com.fundamentals.inheritance;

public class Animal {
	
	private int brian;
	private int body;
	private int size;
	private int weight;
	private String name;
	
	
	public Animal(String name, int brian, int body, int size, int weight ) {
		this.brian = brian;
		this.body = body;
		this.size = size;
		this.weight = weight;
		this.name = name;
	}

	public void eat(){
		System.out.println("Eat method from Animal");
	}
	
	public void move(int speed){
		System.out.println("Animal is moving at "+speed+" KMPH");
		
	}

	public int getBrian() {
		return brian;
	}


	public int getBody() {
		return body;
	}


	public int getSize() {
		return size;
	}


	public int getWeight() {
		return weight;
	}


	public String getName() {
		return name;
	}



}
