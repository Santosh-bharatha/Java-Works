package com.fundamentals.inheritance;

public class Main {

	public static void main(String[] args) {

		
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		//animal.eat();
		
		Dog dog = new Dog("sony", 8, 20, 2,4,1,20, 0, 0, "long silky" );
		dog.eat();
		dog.walk();
		dog.run();
		dog.move(5);
	}

}
