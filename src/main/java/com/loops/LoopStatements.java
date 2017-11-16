package com.loops;

public class LoopStatements {
	
	public static void main(String args[]){
		
		
		System.out.println("Is Prime : "+ isPrime(20));
		
		int count =0;
		
		for (int i = 10; i < 50; i ++){
			
			
			if(isPrime(i)){
				count++;
				System.out.println("is prime ::"+i+" Is a prime number");
				if(count==10){
					System.out.println("Exiting the loop");
					break;
				}
				
			}
			
			
		}
	}
	
	
	public static boolean isPrime(int n){
		if (n == 1){
			return false;
		}
		for(int i=2; i <= (long) Math.sqrt(n); i ++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	
	public static double calculateInterest(double amount, double interestRate){
		return(amount *(interestRate/100));
	}

}
