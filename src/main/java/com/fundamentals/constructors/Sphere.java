package com.fundamentals.constructors;

public class Sphere {
	
	int radius = 0;
	double xCenter;
	double yCenter;
	double zCenter;
	
	public Sphere(){
		radius = 1;
		
	}
	
	public Sphere(double x, double y, double z){
		this();
		xCenter = x;
		yCenter =y;
		zCenter = z;
		System.out.println("3 param constructor got invoked");
	}
	
	public Sphere(int theRadius, double x, double y, double z){
		this(x, y, z);
		radius = theRadius;
	}
	
	public static void main(String args[]){
		
		Sphere sphere = new Sphere(1, 10.00, 20.00, 30.00);
		
	}
	

}
