package com.swiggy.model;

public class Sign {
	
	private String  name;
	private String mobileNumber;
	
	public Sign() {
		
	}

	
	public Sign(String name, String mobileNumber) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	

}
