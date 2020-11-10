package com.service;

public abstract class Card {
	protected String holderName;

	protected String cardNumber;

	protected String expiryDate;

	public String getHolderName() {
		return holderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public Card(String holderName, String cardNumber, String expiryDate) {
		super();
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

}
