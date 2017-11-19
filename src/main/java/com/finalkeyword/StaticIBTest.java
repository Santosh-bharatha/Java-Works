package com.finalkeyword;

import ch.qos.logback.core.net.SyslogOutputStream;

public class StaticIBTest {
	
	public static final String owner;
	
	static{
		owner = "tim";
		System.out.println("SIBTest static initialization block called");
	}
	public StaticIBTest(){
		System.out.println("SIB constructor called");
	}
	static{
		System.out.println("2nd initialization block called");
	}
	public void someMethod(){
		System.out.println("someMethod called");
	}

}
