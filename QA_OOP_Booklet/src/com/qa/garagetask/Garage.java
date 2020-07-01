package com.qa.garagetask;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vh) {
		vehicles.add(vh);

	}

	// what about if it is empty ?
	public void printVehiclesInGarage() {
		for (Vehicle vh : vehicles) {
			System.out.println(vh.toString());
		}
	}

}
