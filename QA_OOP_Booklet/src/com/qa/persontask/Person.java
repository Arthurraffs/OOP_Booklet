package com.qa.persontask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person extends People {

	List<People> people = new ArrayList<>();
	
	// Add a person
	
	public void addPerson(People p) {
		people.add(p);
	}
	
	// Remove a person

	public void removePerson(String surname) {
		for (People p : people) {
			if (p.getSurname() == surname) {
				people.remove(p);
				break;
			}
		}
	}

	public void removePerson(int empID) {
		for (People p : people) {
			if (p.getEmpID() == empID) {
				people.remove(p);
				break;
			}
		}
	}

	public void printPeople() {
		if (this.people.size() != 0) {
			for (People p : people) {
				System.out.println(p.toString());
			}
		} else {
			System.out.println("There are no people.");
		}
	}

	// Search for a person
	
	public void searchMethod() {
		Scanner s = new Scanner(System.in);

		System.out.println("Input the full name of the person you want to search for: ");

		boolean flag = false;

		String search = s.nextLine();
		for (People p : people) {
			if (search.equals(p.getFullName())) {
				System.out.println(p);
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("User does not exist");
		}
	}

}
