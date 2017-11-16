package com.interfaces;

public interface ITelephone {
	
	public void powerOn();
	public void dial(int phoneNumber);
	public void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
	

}
