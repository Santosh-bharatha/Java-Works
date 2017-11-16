package com.programs;

public class Immutable1 {

	private int data;
	public Immutable1(int initVal){
		data = initVal;
	}
	private int read(){
		return data;
	}
	private boolean nonzero(){
		return data!=0;
		
	}
	
	public Immutable1 multiply(int multiplier){
		return new Immutable1(data * multiplier);
	}
	
	public static void f(Immutable1 i1){
		Immutable1 quad = i1.multiply(4);
		System.out.println("i1 = "+ i1.read());
		System.out.println("quad = "+ quad.read());
	}
	public static void main(String[] args) {
		Immutable1 x = new Immutable1(47);
		System.out.println("x = "+ x.read());
		f(x);
       System.out.println("X = "+ x.read());
	}

}