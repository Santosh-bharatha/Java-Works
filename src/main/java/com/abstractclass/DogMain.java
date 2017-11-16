package com.abstractclass;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("tommy");
		dog.eat();
		dog.breath();
		
		Parrot bird = new Parrot("Indian Parrot");
		bird.breath();
		bird.eat(); 
		bird.fly();
		
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();

	}

}
