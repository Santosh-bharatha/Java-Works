package com.loops;

public class FinallyDemo {
	
	static void procA(){
		try{
			System.out.println("Inside ProcA");
			throw new RuntimeException("demo");
		}finally{
			System.out.println("procA's finally");
		}
	}

	static void procB(){
		try{
			System.out.println("Inside ProcB");
			return;
		}finally{
			System.out.println("procB's finally");
			
		}
	}
	
	static void procC(){
		try{
			System.out.println("Inside Proc C");
		}finally{
			System.out.println("ProcC's finally");			
		}
	}
	public static void main(String[] args) {

		try{
			procC();
		}catch(Exception e){
			System.out.println("Exception Cauthg"+e);
			throw e;
			
		}
		procB();
		procA();
	}

}
