package com.initializer;


public class Initializer {
	
int speed;
int force;

{force =200;}
	
Initializer(){
		System.out.println("Speed is "+speed);
		System.out.println("force is "+force);
		System.out.println("constructor is invoked");
	}

{System.out.println("instance initializer block invoked");}


   {
	speed=100;
	}

	public static void main(String[] args) {
		
		Initializer i1 = new Initializer();
		Initializer i2 = new Initializer();
		

		
	}

}
