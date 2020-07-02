package com.qa.persontask;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		//Input 
		p.addPerson(new People(1, "Eoin", "Rafferty", 22, "IT Consultant", 1));
		p.addPerson(new People(2, "Vinesh", "Ghela", 25, "Trainer", 24));
		p.addPerson(new People(3, "Frank","frank", 22, "Trainer", 24));
		p.printPeople();
		
		// Input person's surname or ID to remove from the list.
		p.removePerson("Eoin Rafferty");
		p.printPeople();
		
		p.searchMethod();
	}

}
