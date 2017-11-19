package com.finalkeyword;

public class FinalMain {

	public static void main(String[] args) {
		
		/*FinalDemo fd1 = new FinalDemo("one");
		FinalDemo fd2 = new FinalDemo("two");
		FinalDemo fd3 = new FinalDemo("three");
		
		System.out.println(fd1.getInstance());
		System.out.println(fd2.getInstance());
		System.out.println(fd3.getInstance());

		int pw = 689987;
		Password pwd = new ExtendedPassword(pw);
		pwd.storePassword();
		
		pwd.letMeIn(1);
		pwd.letMeIn(2);
		pwd.letMeIn(3);
		pwd.letMeIn(-1);
		pwd.letMeIn(689987);*/
		
		System.out.println("Main method called");
		StaticIBTest sibTest = new StaticIBTest();
		sibTest.someMethod();
		System.out.println("Owner is "+StaticIBTest.owner);
	}

}
