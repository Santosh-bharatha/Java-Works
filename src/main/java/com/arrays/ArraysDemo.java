package com.arrays;

import java.util.Scanner;

public class ArraysDemo {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		for(int i=0; i<myIntegers.length; i++){
			System.out.println("element "+i+" value :"+myIntegers[i]);
		}
		System.out.println("Average values is :"+ getAverage(myIntegers));
	}
	
	private static int[] getIntegers(int number) {

		System.out.println("Enter "+ number + " integer values .\r");
		int[] values = new int[number];
		for(int i=0; i<values.length; i++){
			values[i] = scanner.nextInt();
		}
		return values;
	}

	public static void printArray(int[] array){
		for(int i=0; i< array.length; i++){
		
			System.out.println("element "+i+" value :"+array[i]);
		}
	}
	
	public static double getAverage(int[] array){
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		return (double) sum / (double)array.length;
	}

}
