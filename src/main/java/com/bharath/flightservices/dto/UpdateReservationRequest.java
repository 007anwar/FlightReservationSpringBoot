package com.bharath.flightservices.dto;

public class UpdateReservationRequest {

	private int id;
	private boolean checkIn;
	private Boolean confirm;

	public Boolean getConfirm() {
		return confirm;
	}

	public void setConfirm(Boolean confirm) {
		this.confirm = confirm;
	}

	private int numberOfBags;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

}