package com.finalkeyword;

public class FinalDemo {
	
	public final int instanceNumber  ;
	private static int classCounter = 0;
	private final String name;
	
	public FinalDemo(String name){
		this.name = name;
		classCounter ++;
		instanceNumber = classCounter;
		System.out.println(name + "created, instance is :"+ instanceNumber);
	}
	
	public int getInstance(){
		return instanceNumber;
	}

}
