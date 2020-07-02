package com.qa.persontask;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		//Input 
		p.addPerson(new People(1, "Eoin", "Rafferty", 22, "IT Consultant", 1));
		p.addPerson(new People(2, "Vinesh", "Ghela", 25, "Trainer", 24));
		p.addPerson(new People(3, "Frank", "frank", 22, "Trainer", 24));
		
		// Input person's surname or ID to remove from the list.
		p.removePerson("Rafferty");
		
		// Prints people once added or removed.
		p.printPeople();
		
		// Calls Search function and asks you to input a full name in the console
		// Then finds the desired person in the list
		p.searchMethod();
	}

}
