package com.qa.garagetask;

public class Motorcycle extends Vehicle {

	private boolean racingOrNot;
	private double topSpeed;

	public String racing() {
		if (racingOrNot = true) {
			return "Racing";
		} else {
			return "Not racing";
		}
	}

	public Motorcycle(String name, String colour, String make, String model, int year, double price, double hoursWorked,
			boolean racingOrNot, double topSpeed) {
		super(name, colour, make, model, year, price, hoursWorked);
		this.racingOrNot = racingOrNot;
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "Motorcycle: [Name = " + getName() + ", Make = " + getMake() + ", Model = " + getModel() + ", Colour = "
				+ getColour() + ", year = " + year + ", price = " + price + ", Racing bike?  = " + racing()
				+ ", Top speed = " + topSpeed + "mph, " + "Hours worked : " + getHoursWorked() + ", Bill cost: £"
				+ calculateBill() + "]";
	}

	@Override
	public double calculateBill() {
		double bill;
		bill = (hoursWorked * 13);
		return bill;
	}

}
