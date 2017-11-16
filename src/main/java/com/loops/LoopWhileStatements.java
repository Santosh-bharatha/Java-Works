package com.loops;

public class LoopWhileStatements {

	public static void main(String[] args) {

		int count = 0;

		int number =5;
		int finishNumber = 20;
		while (number <= finishNumber){
			if(!isEven(number)){
				number ++;
				continue;
			}else{
				if(isEven(number)){
					count++;
					if(count==5){
						break;
					}
				}
			}
			System.out.println("Even number :"+ number);
			number ++;
		}
		System.out.println("Even Numbers found "+ count);
		
	}
	
	public static boolean isEven(int i){
		
		if(i%2 == 0){
			System.out.println(i+" is Even number");
			return true;
		}else{
			System.out.println(i+"is not Even number");
			return false;
		}
		
		
	}

}
