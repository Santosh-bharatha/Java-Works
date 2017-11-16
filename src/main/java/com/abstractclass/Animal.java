package com.abstractclass;

public abstract class Animal {
	
	private String name;
	
	public Animal(String name){
		this.name = name;
	}
	
	public abstract void eat();
	public abstract void breath();
	
	public String getName(){
		return name;
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
