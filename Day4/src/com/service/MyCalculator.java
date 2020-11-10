package com.service;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				sum += i;
		}
		System.out.println("I implemented " + this.getClass().getInterfaces()[0]);
		return sum;
	}

}
