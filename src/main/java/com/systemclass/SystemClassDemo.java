package com.systemclass;

import java.io.IOException;
import java.util.Properties;

public class SystemClassDemo {

	public static void main(String[] args) {
		//System.out.println(System.getProperty("user.dir"));
		java.util.Properties properties = System.getProperties();
		properties.list(System.out);
		
		String oldValue = System.clearProperty("java.class.path");
		System.setProperty("user.dir", "/WORK/workspace-sts-3.8.3.RELEASE/JavaWorks");
		System.out.println(System.getProperty("user.dir"));
		
		System.setProperty("password", "myPassword");
	    System.out.println(System.getProperty("password"));
	    
	    System.out.println(System.getProperty("os.name"));
	    System.out.println(System.getProperty("java.specification.version"));
	    
	    Properties prop = System.getProperties();
	    System.out.println("Printing all System properties");
	    prop.list(System.out);
	    
	    String previousValue = System.setProperty("application.property", "newValue");
	    System.out.println("::::"+previousValue);
	    
	    String version = System.getProperty("java.version");

	    System.out.println("JRE Version = " + version);
	    
	    String userHome = "user.home";
	    String path = System.getProperty(userHome);
	    System.out.println("your Home path :"+path);
	    
	    String name = "os.name";
	    String osversion = "os.version";
	    String architecture = "os.arch";

	    System.out.println("Name: " + System.getProperty(name));
	    System.out.println("Version: " + System.getProperty(osversion));
	    System.out.println("Architecture: " + System.getProperty(architecture));
	    
	    String dataFolder = System.getProperty("user.dir") + System.getProperty("file.separator")
        + "data";

       System.out.println("Data Folder = " + dataFolder);
       
       String pathSeparator = properties.getProperty("path.separator");
       System.out.println("pathSeparator = " + pathSeparator);
	}

}
