package com.interfaces;

public class PhoneDemo {

	public static void main(String[] args) {
		ITelephone iphone;
		iphone = new DeskPhone(123456);
		iphone.powerOn();
		iphone.callPhone(12345);
		iphone.answer();
		
		iphone = new MobilePhone(254699);
		iphone.powerOn();
		iphone.callPhone(254699);
		iphone.answer();

	}

}
