package com.oops;

public class DeluxBurger extends Hamburger{

	public DeluxBurger() {
		super("Delux ", "Sausage & chicken", 14.50, " white");

		super.addHamburgerAddition1("Chips", 2.0);
		super.addHamburgerAddition2("Soda ", 1.0);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Cannot add any additional Item");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot add any additional Item");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Cannot add any additional Item");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Cannot add any additional Item");
	}
	

}
