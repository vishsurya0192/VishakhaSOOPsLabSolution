package com.mylearning.model;
/* @author Vishakha
 * Date: 11/27/21
 */

public class Employee {
	private String firstName, lastName;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName() {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName() {
		this.lastName = lastName;
	}

}
