package com.initializer;

class A{
	A(){
		System.out.println("parent class constructor invoked");
	}
}

public class Initializer2  extends A{
	Initializer2(){
		super();
		System.out.println("Child class Constructor invoked");
	}
	{System.out.println("instance initializer block is invoked");}
	
	public static void main(String args[]){
		Initializer2 it2 = new Initializer2();
	}

}
