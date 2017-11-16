package com.poly;

 class CarDemo {
	
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	
	
	public CarDemo(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
		this.wheels=4;
		this.engine=true;
	}


	public int getCylinders() {
		return cylinders;
	}


	public String getName() {
		return name;
	}
	
	public String startEngine(){
		return "Car-> startEngine()";
	}
	public String accelerate(){
		return "Car-> accelerate()";
	}
	public String brake(){
		return "Car _> brake()";
	}
	

}

class Nissan extends CarDemo{

	public Nissan(int cylinders, String name) {
		super(cylinders, name);
	}
	@Override
	public String startEngine(){
		return getClass().getSimpleName()+"-> StartEngine";
	}
	@Override
	public String accelerate(){
		return getClass().getSimpleName()+"-> accelerate()";
	}
	@Override
	public String brake(){
		return getClass().getSimpleName()+" -> brake()";
	}
	
}

class Mustang extends CarDemo{

	public Mustang(int cylinders, String name) {
		super(cylinders, name);
	}
	@Override
	public String startEngine(){
		return getClass().getSimpleName()+" -> StartEngine";
	}
	@Override
	public String accelerate(){
		return getClass().getSimpleName()+"-> accelerate()";
	}
	@Override
	public String brake(){
		return getClass().getSimpleName()+" -> brake()";
	}
	
}


public class Car{
	
	public static void main(String args[]){
		
		CarDemo car;
		car = new Nissan(8, "Altima Car");
		System.out.println(car.getName() +":"+car.getCylinders());
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		car = new Mustang(12, "GTR Car");
		System.out.println(car.getName() +":"+car.getCylinders());
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
	}
	
}
