package com.example.demo;

public enum Carrers {

	MASTERS("MASTERS"),
	BACHELORS("BACHELORS"),
	PG("PG");

	private String carrer;
	
	Carrers(String carrer) {
		this.carrer = carrer;
	}
	public String getCarrer() {
		return carrer;
	}

	
	
}
