package com.generics;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WareHouseDemo {

	public static void main(String[] args) {

		
		
		Container<List<Integer>> warehouse_list = new Warehouse<>();
		
		warehouse_list.set(Arrays.asList(1,3,8,34));
		System.out.println("** "+warehouse_list.get());
		
		List[] list = new List[2];
		list[0] = new ArrayList();
		list[1] = new LinkedList();
		
		
	}

}


interface Container<T>{
	void set(T x);
	T get();
}

class Warehouse<T> implements Container<T>{

	private T x;
	
	@Override
	public void set(T x) {
		
		this.x = x;
	}

	@Override
	public T get() {
		return x;
	}
	
}