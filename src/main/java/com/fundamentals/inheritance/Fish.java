package com.fundamentals.inheritance;

public class Fish extends Animal{
	
	public Fish(String name, int brian, int body, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);

		this.gills=gills;
		this.eyes=eyes;
		this.fins=fins;
	}
	private int gills;
	private int eyes;
	private int fins;
	
	
	private void rest()
	{
		
	}
	private void moveMuscles(){
		
	}
	private void swim(int speed){
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
	private void moveBackFin() {
		// TODO Auto-generated method stub
		
	}
}
