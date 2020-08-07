package com.tts.WebApp.Model;

public class Request {

	//fields
	private String zipCode;
	
	//constructor
	public Request() {
		
	}

	public Request(String zipCode) {
		this.zipCode = zipCode;
	}

	//Getters and Setters
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	//methods
	@Override
	public String toString() {
		return "Request [zipCode=" + zipCode + "]";
	}
	
	
}
