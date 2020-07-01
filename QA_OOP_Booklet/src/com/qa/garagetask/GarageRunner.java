package com.qa.garagetask;

public class GarageRunner {

	public static void main(String[] args) {

		// ArrayList implementation to be used

		Garage g = new Garage();

		g.addVehicle(new Car("Eoin's car", "Black", "BMW", "730d", 2016, 14000.00, 4.5, true, 3.0));
		g.addVehicle(new Motorcycle("Eoin's Motorbike", "Black", "HD", "Generic", 2020, 6000.00, 2, false, 200));
		g.addVehicle(new Boat("Eoin's Boat", "Black", "Boatco", "Default", 2020, 40000.00, 23.5, true, 0));

		g.printVehiclesInGarage();

	}

}
