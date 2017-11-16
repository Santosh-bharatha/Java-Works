package com.scopes;

public class ScopeDemo {

	public static void main(String[] args) {

		String varFour = "this is private to main()";
		
		ScopeCheck scopeInstance = new ScopeCheck();
		System.out.println("ScopeInstance privateVar is "+scopeInstance.getVarOne());
	    System.out.println(varFour);
	    
	    scopeInstance.timesTwo();
	    System.out.println("*********");
	    
	    ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
	    System.out.println("var3 is not accessible here:"+ innerClass.var3);
	    
	}

}
