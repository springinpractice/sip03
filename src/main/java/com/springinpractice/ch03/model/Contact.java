package com.springinpractice.ch03.model;

public class Contact implements Comparable<Contact> {
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public Contact() {
	}
	
	public Contact(String firstName, String lastName, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
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
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return firstName + " " + lastName;
	}
		
	private String getComparableString() {
		StringBuffer returnVal = new StringBuffer();
		if (lastName != null) {
			returnVal.append(lastName); 
		}
		if (firstName != null) {
			returnVal.append(firstName); 
		}
		return returnVal.toString();
	}

	/**
	 * Crude sorting...
	 */
	public int compareTo(Contact o) {		
		return this.getComparableString().compareTo(o.getComparableString());
	}
}