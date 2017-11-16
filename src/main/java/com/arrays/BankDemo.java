package com.arrays;

public class BankDemo {

	public static void main(String[] args) {

		Bank bank = new Bank("National Bank");
		bank.addBranch("Herndon");
        bank.addCustomer("Santosh", "Herndon", 500.00);
        bank.addCustomer("Kumar", "Herndon", 500.00);
        
        bank.addBranch("sydney");
        bank.addCustomer("bob", "sydney", 50.00);
        
        bank.listCustomers("Herndon",true);
        
        bank.addBranch("Melborne");
        bank.listCustomers("Melborne",true);
        
        if(!bank.addCustomer("Brian", "Melborne", 2000.00)){
        	System.out.println("Error Melborne dint exist");
        }
        if(!bank.addCustomerTransaction("sydney", "vikram", 30.00)){
        	System.out.println("Customer or branch doesnot exist");
        }
		
	}

}
