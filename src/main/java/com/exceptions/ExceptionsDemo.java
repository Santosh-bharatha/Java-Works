package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		
		/*int x =98;
		int y = 0;
		
		System.out.println(divideByL(x,y));

		System.out.println(divideEAFP(x,y));
		
		System.out.println(divide(x,y));*/
		
		
		int x = getIntEAEP();
		System.out.println("X is "+x);

	}
	

	private static int getInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	private static int getIntBYL(){
		Scanner scanner = new Scanner(System.in);
		boolean isValid = true;
		System.out.println("Please enter an integer");
		String input = scanner.next();
		for(int i=0; i< input.length(); i++){
			if(!Character.isDigit(input.charAt(i))){
				isValid = false;
				break;
			}
		}
		if(isValid){
			return Integer.parseInt(input);
		}
		return 0;
	}

	private static int getIntEAEP(){
		Scanner scan = new Scanner(System.in);
		try{
			return scan.nextInt();
		}catch(InputMismatchException e){
			e.printStackTrace();
			return 0;
		}
	}

	private static int divideEAFP(int x, int y) {
		
		try{
			return x/y;
		}catch(ArithmeticException e){
			return 0;
		}
		
		
		
	}

	private static int divideByL(int x, int y) {
		if(y !=0){
			return x / y;
		}else{
			
			return 0;
		}
		
	}

	private static int divide(int x, int y){
		return x/y;
	}
}
