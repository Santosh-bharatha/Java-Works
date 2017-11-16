package com.statements;

public class TestSwitch {

	public static void main(String[] args) {

//		int value =1;
//		if (value==1){
//			System.out.println("Value was 1");
//			
//		}else if(value ==2){
//			System.out.println("Value was 2");
//		}
//		else{
//			System.out.println("Was not 1 or 2");
//		}
//		
		int switchValue = 2;
		
		switch(switchValue){
		case 1: 
			System.out.println("Value was ::1");
			break;
			
		case 2:
			System.out.println("Value was ::2");
			break;
			 
		case 3:
			System.out.println("Value was not 1 or 2");
			
			default:
				System.out.println("Was not 1 or 2");
		}
		
		
		char charValue = 'A';
		
		switch(charValue){
		
		case 'A': 
			System.out.println("Value is A");
		break;
		
		case 'B':
			System.out.println("Value is B");
			break;
			
		case 'C':
			System.out.println("Value is C");
			break;
			
		case 'D':
			System.out.println("Value is D");
			break;
		case 'E':
			System.out.println("Value is E");
			break;
		default:
			System.out.println("Value is not A, B, C, D , E  " + charValue);
			break;
			
		}
		
		String month="january";
		
		switch(month.toLowerCase()){
		case "january":
			System.out.println("Jan");
		 break;
		default :
			System.out.println("Not sure");
			break;
		}
		
	}

}
