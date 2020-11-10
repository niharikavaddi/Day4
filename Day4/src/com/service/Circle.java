package com.service;

public class Circle extends Shape {
	private Float radius;

	public Circle(String name, Float radius) {
		super(name);
		this.radius = radius;
	}

	public Float getRadius() {
		return radius;
	}

	@Override
	public Float calculateArea() {
		return (2 * 3.14f * radius);
	}

}
