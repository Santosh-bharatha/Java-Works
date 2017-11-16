package com.oops;

public class VipCustomer {
	
	private double creditLimit;
	private String name;
	private String email;
	
	
	
	public VipCustomer() {
		this(200.00, "Santosh", "santosh@gmail.com");
	}
	public VipCustomer(String name, String email){
		this(100.55, name, email);
		this.name = name;
		this.email = email;
		
	}
	
	public VipCustomer(double creditLimit, String name, String email) {
		this.creditLimit = creditLimit;
		this.name = name;
		this.email = email;
	}
	
	
	public static void main(String args[]){
		VipCustomer vc = new VipCustomer();
		System.out.println("name :"+vc.getName()+"email :"+vc.getEmail()+"Credit Limit :"+vc.getCreditLimit());
	  
		VipCustomer vc2 = new VipCustomer("Pappi ", "pappi@gmail.com");
		System.out.println("name :"+vc2.getName()+"email :"+vc2.getEmail()+"Credit Limit :"+vc2.getCreditLimit());
		  
		VipCustomer vc3 = new VipCustomer(200.00, "Katti ", "Katti@gmail.com");
		System.out.println("name :"+vc3.getName()+"email :"+vc3.getEmail()+"Credit Limit :"+vc3.getCreditLimit());
		
	
	}
	
	
	
	
	
	
	
	
	
	
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	

}
