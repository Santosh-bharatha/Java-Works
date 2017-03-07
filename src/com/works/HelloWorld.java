package com.works;

import java.util.Date;
import java.util.GregorianCalendar;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Person[] people = new Person[2];
		
		people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		people[1] = new Student("Maria Morris", "computer science");
		
		for(Person p: people){
			System.out.println(p.getName() + " , " +p.getDescription());
		}
		
			

	}

}
abstract class Person{
	
	private String name;
	public Person(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public abstract String getDescription();
}

class Employee extends Person{
	   private double salary;
	   private Date hireDay;

	public Employee(String n, double s, int year, int month, int day) {
		// TODO Auto-generated constructor stub
		super(n);
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return String.format("an employee with a salary of $%.2f", salary);
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary+= raise;
	}
	
}
class Student extends Person{
	
	private String major;

	public Student(String n, String m) {

	super(n);
	major = m;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "a student majoring in " + major;
	}
	
}