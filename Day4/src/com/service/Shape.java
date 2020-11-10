package com.service;

public abstract class Shape {
	protected String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Float calculateArea();
}
