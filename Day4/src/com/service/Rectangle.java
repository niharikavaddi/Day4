package com.service;

public class Rectangle extends Shape {

	private Float length;
	private Float breadth;

	public Float getLength() {
		return length;
	}

	public Float getBreadth() {
		return breadth;
	}

	public Rectangle(String name, Float length, Float breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public Float calculateArea() {
		return length * breadth;
	}
}
