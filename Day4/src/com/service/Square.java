package com.service;

public class Square extends Shape {
	public Float getSide() {
		return side;
	}

	public Square(String name, Float side) {
		super(name);
		this.side = side;
	}

	private Float side;

	@Override
	public Float calculateArea() {
		return side * side;
	}
}
