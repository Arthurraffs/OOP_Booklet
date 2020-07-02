package com.qa.garagetask;

public class Car extends Vehicle {

	private boolean automatic;
	
	public String automatic() {
		if (automatic = true) {
			return "Automatic";
		} else {
			return "Manual";
		}
	}

	public Car(String cusName, String vhType, String colour, String make, String model, int year, double hoursWorked,
			boolean automatic) {
		super(cusName, vhType, colour, make, model, year, hoursWorked);
		this.automatic = automatic;
	}

}
