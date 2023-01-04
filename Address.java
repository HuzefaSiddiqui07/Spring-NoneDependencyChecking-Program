package com.springframework.dependencychecking.none.applicationcontext;

public class Address {

	// Declare

	private String addressLine;

	// Use Getter & Setter

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	// Use toString Method

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + "]";
	}

}
