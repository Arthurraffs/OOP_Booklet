package com.qa.garagetask;

public abstract class Vehicle {

	private String name;
	private String colour;
	protected String make;
	protected String model;
	protected int year;
	protected int currentYear = 2020;
	protected double price;
	protected double hoursWorked;

	public abstract double calculateBill();

	public Vehicle(String name, String colour, String make, String model, int year, double price, double hoursWorked) {
		super();
		this.name = name;
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.hoursWorked = hoursWorked;
	}

	public Vehicle() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
