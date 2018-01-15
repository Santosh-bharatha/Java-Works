package com.generics;

class TwoGen<T, V>{
	T ob1;
	V ob2;
	
	TwoGen(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}
	T getob1(){
		return ob1;
	}
	V getob2(){
		return ob2;
	}
	
	void showTypes(){
		System.out.println("Type of T is " + ob1.getClass().getName());
		System.out.println("Type of V is " + ob2.getClass().getName());
		
	}
	
}

class GenericDemo<T>{
	T ob;
	T ob1;
	T ob2;
	
	
	GenericDemo(T o){
		ob = o;
	}
	T getOb(){
		return ob1;
	}
	
	void showType(){
		System.out.println("Type of T is "+ ob.getClass().getName());
	}
}

public class GenericClass {

	public static void main(String[] args) {

		GenericDemo<Integer> iOb = new GenericDemo<Integer>(88);
		iOb.showType();
		
		int v = iOb.getOb();
		System.out.println("Value :"+ v);
		
		GenericDemo<String> iSt = new GenericDemo<String>("hello");
		iSt.showType();
		
		String str = iSt.getOb();
		System.out.println("Value :"+ str);
		
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
		tgObj.showTypes();
		
		int vv = tgObj.getob1();
		System.out.println("Value "+ vv);
		
		String strr = tgObj.getob2();
		System.out.println("value :"+ strr);
		
		
		
		
	}
	
	class Gadgets<T>{
		
		
	}

}
