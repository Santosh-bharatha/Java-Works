package com.arrays;

import java.util.Scanner;

public class ResizeArray {
	
	private static Scanner scanner = new Scanner(System.in);
	private static int[] baseData = new int[10];

	public static void main(String[] args) {
		System.out.println("Enter 10 Integers: ");
		getInput();
		printArray(baseData);
		resizeArray();
		System.out.println("Enter 12 Integers");
		getInput();
		printArray(baseData);

	}
	
	public static void getInput(){
		for(int i=0; i< baseData.length; i++)
			baseData[i] = scanner.nextInt();
	}
	public static void printArray(int[] array){
		for(int i=0; i< array.length; i++){
		
			System.out.println("element "+i+" value :"+array[i]);
		}
	}
	public static void resizeArray(){
		int[] original = baseData;
		baseData= new int[12];
		for(int i=0; i< original.length; i++)
		baseData[i] = original[i];
	}
	

}
