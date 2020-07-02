package com.qa.garagetask;

import java.util.ArrayList;
import java.util.List;

public class Garage implements CalcBill {

	List<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vh) {
		vehicles.add(vh);

	}

	public void removeVehicle(String cusName) {
		for (Vehicle vh : vehicles) {
			if (vh.getCusName() == cusName) {
				vehicles.remove(vh);
				break;
			}
		}	
	}
	
	public void removeVehicle(String make, String model) {
		for (Vehicle vh : vehicles) {
			if (vh.getMake() == make) {
				if (vh.getModel() == model) {
					vehicles.remove(vh);
					break;
				}
			}
		}	
	}

	
	public void printVehiclesInGarage() {
		if (this.vehicles.size() != 0) {		
		for (Vehicle vh : vehicles) {
			System.out.println(vh.toString());
			}
		} else {
			System.out.println("The garage is empty.");
			}
		}

	@Override
	public void calcBill() {
		// TODO Auto-generated method stub
		
	}
}
