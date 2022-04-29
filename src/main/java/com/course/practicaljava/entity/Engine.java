package com.course.practicaljava.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = {"color", "serialNumber"})
public class Engine {

	private String fuelType;
	
	private int horsePower;
	
	private String color = "Black";
	
	private String serialNumber = "SN00000001";
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Engine() {
		
	}

	public Engine(String fuelType, int horsePower) {
		super();
		this.fuelType = fuelType;
		this.horsePower = horsePower;
	}

	public String getFuelType() {
		return fuelType;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [fuelType=" + fuelType + ", horsePower=" + horsePower + "]";
	}
}
