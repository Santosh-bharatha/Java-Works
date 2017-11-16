package com.poly;

class Bank{
	float getRateOfInterest(){
		return 0;
	}
}
class SBI extends Bank{
	float getRateOfInterest(){return 8.4f;} 
}
class Axis extends Bank{
	float getRateOfInterest(){return 9.7f;}  
}
class ICICI extends Bank{
	float getRateOfInterest(){return 7.3f;}  
}
class Hdfc extends Bank{
	float getRateOfInterest(){return 6.7f;}  
}

public class BankDemo {
	
	public static void main(String args[]){  
		Bank b;
		b = new SBI();
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b= new Axis();
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()); 
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b = new Hdfc();
		System.out.println("Hdfc Rate of Interest: "+b.getRateOfInterest());
		
	}

}
