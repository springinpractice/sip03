// Source project: sip03, branch: 01 (Maven Project)
package com.springinpractice.ch03.model;

public class Member {
	private String firstName;
	private String lastName;
	
	public Member() {
	}
	
	public Member(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	public String toString() {
		return firstName + " " + lastName;
	}
}
