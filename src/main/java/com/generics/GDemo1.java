package com.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GDemo1<T extends List & Serializable> {

	public static void main(String[] args) {

		//List<String> words= new ArrayList<String>();
		List<String> words= new ArrayList<String>();
		
		words.add("Hello");
		words.add(" World");
		
		String s = words.get(0) + words.get(1);
		
		assert s.equals("Hello World !");
		System.out.println("The current value of String s is :"+s); 
		
		
	}

}
