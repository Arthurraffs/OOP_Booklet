package com.qa.persontask;

public class People {
	
	// needs age, name (fname, surname), job title
	// need method to return them all as String (toString())
	// needs additional object examples in class: person ID, length of employment
	// need to store all objects in a list
	// need to output all people to console
	// need method to search for person by name
	
	private int empID;
	private String fname;
	private String surname;
	private int age;
	private String jobTitle;
	private int legnthEmployed;
	private String fullName;
	

	public People(int empID, String fname, String surname, int age, String jobTitle, int legnthEmployed) {
		super();
		this.empID = empID;
		this.fname = fname;
		this.surname = surname;
		this.age = age;
		this.jobTitle = jobTitle;
		this.legnthEmployed = legnthEmployed;
	}
	
	public People() {
		
	}
	

	@Override
	public String toString() {
		return "Employee [Employee ID = " + empID + ", Full Name = " + getFullName() + ", Age = " + age + ", Job Title = "
				+ jobTitle + ", Time Employed = " + legnthEmployed + "months]";
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getLegnthEmployed() {
		return legnthEmployed;
	}

	public void setLegnthEmployed(int legnthEmployed) {
		this.legnthEmployed = legnthEmployed;
	}

	public String getFullName() {
		fullName = fname + " " + surname;
		return fullName;
	}

	public void setFullName(String fullName) {
		fullName = fname + " " + surname;
		this.fullName = fullName;
	}
	

}
