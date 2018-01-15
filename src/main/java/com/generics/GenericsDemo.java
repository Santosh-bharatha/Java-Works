package com.generics;

import static org.junit.Assert.*;

import java.util.Arrays;

import java.util.List;

import org.junit.Test;

public class GenericsDemo {

	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(1,2,3);
		int sum = 0;
		
		for(int n :ints){
			sum += n;
		}
		assert sum == 6;
		System.out.println("The sum of 1,2,3 is :"+sum);
		
		
		

	}
	
	@Test
	public void testList(){
		List<Integer> ints = Arrays.asList(1,2,3);
		int sum = 0;
		
		for(int n :ints){
			sum += n;
		}
		assertEquals(6, sum);
	}

}
