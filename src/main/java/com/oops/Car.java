package com.oops;

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	
	public Car(String string, String string2, int i, int j, int k, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public void setModel(String model){
		
		String validModel = model.toLowerCase();
		if(validModel.equals("porsche") || validModel.equals("holden")){
			this.model = model;
		}
		else
			this.model="Unknown";
		
	}
	
	public String getModel(){
		return this.model;
	}

}
