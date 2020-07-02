package com.qa.garagetask;

public class GarageRunner {

	public static void main(String[] args) {

		Garage g = new Garage();

		g.addVehicle(new Car("Eoin Rafferty", "Car", "Black", "BMW", "730d", 2016, 7.5, true));
		g.addVehicle(new Motorcycle("Vinesh Ghela", "Motorcycle", "Black", "Kawasaki", "Roadster", 2020, 4));
		g.addVehicle(new Lorry("Josh Dowling", "Lorry", "Red", "Tesla", "Industrial", 2020, 25));
		
		g.fixVehicle();
		
		g.printVehiclesInGarage();

	}

}
