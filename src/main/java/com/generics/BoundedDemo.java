package com.generics;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BoundedDemo<T extends List > {

	public static void main(String[] args) {
		

	}

	public void add_name(T list){
		list.add(0, new ArrayList());
		list.add(1, new ArrayList());
	}
	
}
