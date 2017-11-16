package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryTest {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {

		boolean quit = false;
		int choice =0;
		printInstruction();
		while(!quit){
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice){
			case 0:
				printInstruction();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3: 
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				processArrayList();
			case 7:
				quit = true;
				break;
				
			}
			
		}
	}

	private static void processArrayList() {
		ArrayList<String> newArray =  new ArrayList<String>();
		newArray.addAll(groceryList.getGroceryList());
		
		ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
		String[] myArray = new String[groceryList.getGroceryList().size()];
		myArray = groceryList.getGroceryList().toArray(myArray);
		
	}

	private static void searchForItem() {

		System.out.print("Item to search for:");
		String searchItem = scanner.nextLine();
		if(groceryList.findItem(searchItem)!=null){
			System.out.println("found "+searchItem +"in our groceryList");
		}else{
			System.out.println(searchItem + "is not in the shopping List");
		}
	}

	private static void removeItem() {

		System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo-1);
	}

	private static void modifyItem() {
		System.out.print("Enter Item Number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem);
	}

	private static void addItem() {

		System.out.println("please enter the grocery Item: ");
		groceryList.addGroceryItem(scanner.nextLine());
	}

	private static void printInstruction() {
		System.out.println("\nPress");
		System.out.println("\t 0");
		System.out.println("\t 1");
		System.out.println("\t 2");
		System.out.println("\t 3");
		System.out.println("\t 4");
		System.out.println("\t 5");
		System.out.println("\t 6");
	}
	
	

}
