package com.springframework.dependencychecking.none.applicationcontext;

/* 4. None  :     
               If you set dependency checking to none then it is not mandatory to call setter methods without calling setter methods, you can create the object of your bean class.
                         Program for dependency checking using none. */

public class Client {

	// Declare

	private String firstName;
	private Address address;

	// Use Getter & Setter

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", address=" + address + "]";
	}

	// Create Method
	public void getClient() {

		System.out.println("First Name > " + firstName);
		System.out.println("Address > " + address.getAddressLine());

	}

}
