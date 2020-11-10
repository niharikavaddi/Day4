package com.main;

import java.util.Scanner;

import com.service.MyCalculator;

public class MyCalculatorMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value below 1000:");
		int endvalue = scanner.nextInt();
		MyCalculator myCalculator = new MyCalculator();
		System.out.println(myCalculator.divisor_sum(endvalue));
		scanner = null;
		myCalculator = null;

	}

}
