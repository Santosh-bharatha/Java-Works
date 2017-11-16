package com.initializer;

class A1{
	public static int k;
	public int i;
	public void m(int i){
		this.i = i;
		f();
	}
	 public void f() {
		 System.out.println("A " + i);
			}
}

 class B extends A1{

	 public static int k;
	 public int i;
	 public void f(){
		 System.out.println("B "+i);
	 }
}

public class Test {
	


	public static void main(String[] args) {
		
		
		A1 a = new A1();
		B b = new B();
		A1 ab = new B();
		

	}

}
