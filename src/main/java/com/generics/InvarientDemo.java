package com.generics;

import java.util.ArrayList;
import java.util.List;

public class InvarientDemo {

	public static void main(String[] args) {

		add_item(new ArrayList<Integer>());
		
		add_item1(new Integer[1]);//covarience
	}
	
	public static void add_item(List<Integer> item){
		System.out.println("Done");
	}
	
	public static void add_item1(Number[] num){
		num[0] = 22.5;
	}

}
