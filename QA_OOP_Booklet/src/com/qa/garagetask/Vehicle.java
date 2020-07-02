package com.qa.garagetask;

public abstract class Vehicle {

	private String cusName;
	private String vhType;
	private String colour;
	private String make;
	private String model;
	private int year;
	private double hoursWorked;

	public Vehicle(String cusName, String vhType, String colour, String make, String model, int year, double hoursWorked) {
		super();
		this.cusName = cusName;
		this.vhType = vhType;
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
		this.hoursWorked = hoursWorked;
	}

	public Vehicle() {
	}
	
	@Override
	public String toString() {
		return getVhType() + " [Name = " + getCusName() + ", Make = " + getMake() + ", Model = " 
				+ getModel() + ", Hours worked = " + getHoursWorked() + "]";
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getVhType() {
		return vhType;
	}

	public void setVhType(String vhType) {
		this.vhType = vhType;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	
}