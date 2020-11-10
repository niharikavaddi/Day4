package com.main;

import java.util.Scanner;

import com.service.MembershipCard;
import com.service.PaybackCard;

/**
 * Create an abstract class named Card with the following protected attributes /
 * member variables.
 * 
 * String holderName;
 * 
 * String cardNumber;
 * 
 * String expiryDate;
 * 
 * Include appropriate getters and setters.
 * 
 * Include appropriate constructors. In the 3-argument constructor, the order of
 * the arguments is holderName, cardNumber, expiryDate.
 * 
 * Create a class named MembershipCard. The class MembershipCard is a derived
 * class of Card. Include the following private attributes / member variables.
 * 
 * Integer rating
 * 
 * Include appropriate getters and setters.
 * 
 * Include appropriate constructors. In the 4-argument constructor, the order of
 * the arguments is holderName, cardNumber, expiryDate, rating.
 * 
 * Create a class named PaybackCard. The class PaybackCard is a derived class of
 * Card. Include the following private attributes / member variables.
 * 
 * Integer pointsEarned;
 * 
 * Double totalAmount;
 * 
 * Include appropriate getters and setters.
 * 
 * Include appropriate constructors. In the 5-argument constructor, the order of
 * the arguments is holderName, cardNumber, expiryDate, pointsEarned,
 * totalAmount.
 * 
 * Create another class called Main. In the method, create instances of the
 * above classes and test the above classes. The card details are entered
 * separated by a ‘|’.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class CardMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Membership card");
		System.out.println("2. Payback card");
		System.out.println("Select card type:");
		int type = scanner.nextInt();
		System.out.println("Enter the Card details:");
		String details = scanner.next();
		if (type == 1) {
			String[] detailsarray = details.split("|");
			System.out.println("Enter Ratings");
			int rating = scanner.nextInt();
			MembershipCard membershipCard = new MembershipCard(detailsarray[0], detailsarray[1], detailsarray[2],
					rating);
			System.out.println(detailsarray[0] + "'s Membership card details:");
			System.out.println("Card Number: " + membershipCard.getCardNumber());
			System.out.println("Rating: " + membershipCard.getRating());
		} else if (type == 2) {
			String[] detailsarray = details.split("|");
			System.out.println("Enter points in card");
			int points = scanner.nextInt();
			System.out.println("Enter amount");
			double amount = scanner.nextInt();
			PaybackCard paybackCard = new PaybackCard(detailsarray[0], detailsarray[1], detailsarray[2], points,
					amount);

			System.out.println("Points Earned:" + paybackCard.getPointsEarned());
			System.out.println("Total Amount:" + paybackCard.getTotalAmount());
		}
	}

}
