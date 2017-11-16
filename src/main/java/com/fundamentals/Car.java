package com.fundamentals;

public class Car {


	private int door;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public void setModel(String model){
		String ValidModel = model.toLowerCase();
		
		if(ValidModel.equals("porsche") || ValidModel.equals("holden")){
			this.model = model;
				
		}else
		this.model="unknown";
				
	}
	
	public String getModel()
	{
		return this.model;
	}
}
