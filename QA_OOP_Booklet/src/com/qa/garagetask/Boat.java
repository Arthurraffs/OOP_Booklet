package com.qa.garagetask;

public class Boat extends Vehicle {

	private boolean sailOrMotor;
	private int personCap;

	public String sailOrMotor() {
		if (sailOrMotor = true) {
			return "Sail";
		} else {
			return "Motor";
		}
	}

	public Boat(String name, String colour, String make, String model, int year, double price, double hoursWorked,
			boolean sailOrMotor, int personCap) {
		super(name, colour, make, model, year, price, hoursWorked);
		this.sailOrMotor = sailOrMotor;
		this.personCap = personCap;
	}

	@Override
	public String toString() {
		return "Boat: [Name = " + getName() + ", Make = " + getMake() + ", Model = " + getModel() + ", Colour = "
				+ getColour() + ", year = " + year + ", price = " + price + ", Sail or motor?  = " + sailOrMotor()
				+ ", Person capacity = " + personCap + " people, Hours Worked: " + getHoursWorked() + ", Bill cost: £"
				+ calculateBill() + "]";
	}

	@Override
	public double calculateBill() {
		double bill;
		bill = (hoursWorked * 20);
		return bill;
	}

}
