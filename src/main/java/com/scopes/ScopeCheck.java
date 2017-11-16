package com.scopes;

import ch.qos.logback.core.net.SyslogOutputStream;

public class ScopeCheck {

	public int publicVar = 0;
	private int varOne  = 1;
	
	public ScopeCheck(){
		System.out.println("ScopeCheck created, publicVar = "+ publicVar + ": varOne ="+varOne);
	}
	
	protected int getVarOne(){
		return varOne;
	}
	
	public void timesTwo(){
		int varTwo = 2;
		for(int i=0; i< 10; i++){
			System.out.println(i + "times two is :"+ i * varTwo);
		}
	}
	
	public void useInner(){
		InnerClass innerClass = new InnerClass();
		System.out.println("VarThree from outer class"+innerClass.var3);
	}
	
	public class InnerClass{
		
		public int var3 = 3;
		public InnerClass(){
			System.out.println("InnerClass created, Var3 is : "+ var3);
		}
		
		
		public void timesTwo(){
	System.out.println(varOne);
			for(int i=0; i<10; i++){
				System.out.println(i + "times two is "+ i * var3);
			}
		}
	}
}


