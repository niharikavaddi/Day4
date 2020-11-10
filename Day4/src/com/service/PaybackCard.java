package com.service;

public class PaybackCard extends Card {

	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

	public int getPointsEarned() {
		return pointsEarned;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	private int pointsEarned;

	private double totalAmount;
}
