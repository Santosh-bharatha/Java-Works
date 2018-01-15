package com.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class GenericCollections {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("four");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str + " is " + str.length() + " chars long.");
		}
		
		Person[] persons = new Person[10];
		
		for(int i=0; i<persons.length; i++){
			persons[i] = new Person("A","B",10);
		}
		for(Person p: persons){
			System.out.println(p.getLast());
		}
		
		Person[] authors = {
				new Person("D", "S"),
				new Person("J", "G"),
		        new Person("T", "C"), 
		        new Person("C", "S"),
		        new Person("P", "C"), 
		        new Person("B", "B")
				
		};
		
		Arrays.sort(authors);
		System.out.println("\nOrder after sorting into ascending sequence:");
		
		for(Person author : authors){
			System.out.println(author);
		}
		
		Person[] people = {
				new Person("C", "S"), 
		        new Person("N", "K"),
		        new Person("T", "C"), 
		        new Person("C", "D")
				
		};
		
		int index = 0;
		System.out.println("\nIn search of authors:");
		
		for(Person person : people){
			index = Arrays.binarySearch(authors, person);
			
			if (index >= 0) {
		        System.out.println(person + " was found at index position " + index);
		      } else {
		        System.out.println(person + "was not found. Return value is " + index);
		      }
		}

	}
}

class Person implements Comparable<Person>{
	
	private String lastName;
	private String firstName;
	
	private int age;
	
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person(String last, String first, int a){
		lastName = last;
		firstName = first;
		age = a;
	}
	
	public String toString(){
		return "Last name: " + lastName + " First name: " + firstName + " Age: " + age;
	}
	
	public String getLast(){
		return lastName;
	}

	@Override
	public int compareTo(Person person) {
		int result = lastName.compareTo(person.lastName);
		return result ==0 ? firstName.compareTo(((Person) person).firstName) : result;
	}
}
