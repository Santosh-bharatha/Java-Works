package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepDemo {

	public static void main(String[] args) {
		
		float result = divide();
		System.out.println(" result :"+result);

	}

	private static int divide() {
	
		int x = getInt();
		int y = getInt();
		
		System.out.println("X is :"+x + " Y is : "+y);
		
		return x/y;
	}

	private static int getInt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an Integer");
		
		try {
			return scan.nextInt();
		} catch (InputMismatchException e) {
			// InputMismatchException
			e.printStackTrace();
			return 0;
		}
	}

}
