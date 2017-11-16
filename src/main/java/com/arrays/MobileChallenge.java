package com.arrays;

import java.util.Scanner;

public class MobileChallenge {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("000333665548");
	
	public static void main(String[] args) {
		
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit){
			System.out.println("\n Enter action:(6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action){
			case 0:
				System.out.println("\n Shutting down...");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			}
			
		}

	}
	
	private static void queryContact() {
		// TODO Auto-generated method stub
		
	}

	private static void updateContact() {
		// TODO Auto-generated method stub
		
	}

	private static void removeContact() {
		// TODO Auto-generated method stub
		
	}
	
	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phone = scanner.nextLine();
		Contact newContact = Contact.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact)){
			System.out.println("New contact added: name=" +name + ", phone ="+phone);
		}else{
			System.out.println("Cannot add , "+name+"already on file");
		}
		
	}
	private void printContacts() {

		System.out.println("Contact List");
	}
	private static void printActions() {
		System.out.println("\nAvailable actions: \npress");
		System.out.println("choose your action");
		
	}
	private static void startPhone(){
		System.out.println("Starting phone...");
	}

}
