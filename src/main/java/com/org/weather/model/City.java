package com.org.weather.model;

import com.google.gson.annotations.Expose;

public class City {
	@Expose
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public City(String city) {
		super();
		this.city = city;
	}

	
	
}
