package com.qa.garagetask;

public class Car extends Vehicle {

	private boolean automatic;
	private double engineSize;

	public String automatic() {
		if (automatic = true) {
			return "Automatic";
		} else {
			return "Manual";
		}
	}

	public Car(String name, String colour, String make, String model, int year, double price, double hoursWorked,
			boolean automatic, double engineSize) {
		super(name, colour, make, model, year, price, hoursWorked);
		this.automatic = automatic;
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Car: [Name = " + getName() + ", Make = " + getMake() + ", Model = " + getModel() + ", Colour = "
				+ getColour() + ", year = " + year + ", price = " + price + ", engineSize = " + engineSize
				+ ", automatic = " + automatic() + ", Hours Worked: " + getHoursWorked() + ", Bill cost: £"
				+ calculateBill() + "]";
	}

	@Override
	public double calculateBill() {
		double bill;
		bill = (hoursWorked * 11);
		return bill;

	}

}
