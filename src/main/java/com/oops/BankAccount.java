package com.oops;

public class BankAccount {
	
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public BankAccount(){
		this("56897", 2.50, "Default name", "Default address", "defaultPhone");
		System.out.println("Empty Constructor called");
	}
	
	public BankAccount(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
		System.out.println("Constructor with parameters called");
	}
	
	
	
	public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber); 
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public void deposit(double depositAmount){
		this.balance +=depositAmount;
		System.out.println("Deposit of"+ depositAmount +" made new balance to :"+ this.balance);
	}
	public void withdrawal(double withdrawalAmount){
		if(this.balance - withdrawalAmount <=0){
			System.out.println("Only "+this.balance + "available. withdrawal not processed");
		}else{
			this.balance -= withdrawalAmount;
			System.out.println("withdrawal of "+ withdrawalAmount + "Processed, Remaining balance = "+ this.balance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	
}
