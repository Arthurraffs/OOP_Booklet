package com.qa.garagetask;

public class GarageRunner {

	public static void main(String[] args) {

		Garage g = new Garage();

		g.addVehicle(new Car("Eoin Rafferty", "Car", "Black", "BMW", "730d", 2016, 7.5, true));
		
		
		g.printVehiclesInGarage();

	}

}
