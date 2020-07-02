package com.qa.garagetask;

import java.util.ArrayList;
import java.util.List;

public class Garage extends Vehicle implements CalcBill {

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
		
		for (Vehicle vh : vehicles) {
			if (vh instanceof Car) {
				vh.setBillPrice((vh.getHoursWorked()*12.5) + 200);
				System.out.println(vh.getHoursWorked());
			} else if (vh instanceof Motorcycle) {
				vh.setBillPrice((vh.getHoursWorked()*11) + 150);
			} else if (vh instanceof Lorry) {
				vh.setBillPrice((vh.getHoursWorked()*15) + 400);
			}
		}
	}

	public void fixVehicle() {
		calcBill();
	}
}
