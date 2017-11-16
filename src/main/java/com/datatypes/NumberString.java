package com.datatypes;

public class NumberString {

	public static void main(String[] args) {

		
		String myString = "This is a string";
		System.out.println("MyStrins is equal to : "+ myString);
		myString = myString + ", and this is more.";
		System.out.println(myString);
		
		String numberString = "250.00";
		System.out.println("numberString: "+ numberString);
		
		String lastString ="10";
		int myInt = 50;
		lastString = myInt + lastString;
		
		System.out.println("LastString :"+ lastString);
	}

}
