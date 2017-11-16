package com.initializer;

public class TestSuper {

	public static void main(String[] args) {

		Sub sb = new Sub();
		sb.m1();
		System.out.println("----");
		(new Sub()).m2();
		
	}

}

class Super{
	
	void m1(){
		System.out.println("Super!");
	}
}

class Sub extends Super{
	void m1(){
		super.m1();
		System.out.println("And sub !");
	}
	
	void m2(){
		((Super)this).m1();
	}
}
