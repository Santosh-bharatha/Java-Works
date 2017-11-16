package com.composition;

public class MotherBoard {

	private String model;
	private String manufacturer;
	private int ramSlots;
	private String bios;
	private int i;
	
	public void loadProgram(String programName){
		System.out.println("Program "+ programName + "Is now loading...");
	}
	
	
	public MotherBoard(String model, String manufacturer, int ramSlots, int i, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.i = i;
		this.bios = bios;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public void setRamSlots(int ramSlots) {
		this.ramSlots = ramSlots;
	}
	public String getBios() {
		return bios;
	}
	public void setBios(String bios) {
		this.bios = bios;
	}
	
	
	
}
