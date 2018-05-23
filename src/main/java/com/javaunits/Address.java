package com.javaunits;


public class Address {

	private String village;
	private String dist;
	private String pin;

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [village=" + village + ", dist=" + dist + ", pin=" + pin + "]";
	}
}
