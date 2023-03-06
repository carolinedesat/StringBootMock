package com.example.mockca;

import java.time.LocalDate;

public class Employee {
	
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private int ppsn;
	private String gender;
	private String department;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, LocalDate dob, int ppsn, String gender, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.ppsn = ppsn;
		this.gender = gender;
		this.department = department;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getPpsn() {
		return ppsn;
	}
	public void setPpsn(int ppsn) {
		this.ppsn = ppsn;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", ppsn=" + ppsn
				+ ", gender=" + gender + ", department=" + department + "]";
	}
	
	

}
