package com.main;

import java.util.Scanner;

import com.service.Circle;
import com.service.Rectangle;
import com.service.Square;

/**
 * Create an abstract class named Shape with the following protected attributes
 * / member variables. String name Include a 1-argument constructor. Include
 * getters and setters. Include an abstract method named calculateArea() . This
 * method returns a Float value. Create a class named Circle . The class Circle
 * is a derived class of Shape. Include the following private attributes /
 * member variables. Integer radius Include a 2-argument constructor. The order
 * of the argument is name, radius. Include getters and setters. Override the
 * abstract method calculateArea() defined in the Shape class. This method
 * returns the area of the circle. [Take the value of pi as 3.14] Create a class
 * named Square . The class Square is a derived class of Shape. Include the
 * following private attributes / member variables. Integer side Include a
 * 2-argument constructor. The order of the arguments is name, side Include
 * getters and setters. Override the abstract method calculateArea() defined in
 * the Shape class. This method returns the area of the square. Create a class
 * named Rectangle . The class Rectangle is a derived class of Shape. Include
 * the following private attributes / member variables. Integer length Integer
 * breadth Include a 3-argument constructor. The order of the arguments is name,
 * length, breadth Include getters and setters. Override the abstract method
 * calculateArea() defined in the Shape class. This method returns the area of
 * the rectangle. Create another class called Main. In the method, create
 * instances of the above classes and test the above classes. All Float values
 * are displayed correct to 2 decimal places. All text in bold corresponds to
 * input and the rest corresponds to output.
 * 
 * @author Lakshmi Neeharika
 *
 */

public class ShapeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Rectangle");
		System.out.println("Enter a shape");
		String shape = scanner.next();
		if (shape.equalsIgnoreCase("Circle")) {
			System.out.println("Enter Radius:");
			Float radius = scanner.nextFloat();
			Circle circle = new Circle(shape, radius);
			System.out.println(circle.calculateArea());
			circle = null;
		} else if (shape.equalsIgnoreCase("Square")) {
			System.out.println("Enter Side:");
			Float side = scanner.nextFloat();
			Square square = new Square(shape, side);
			System.out.println(square.calculateArea());
			square = null;
		} else if (shape.equalsIgnoreCase("Rectangle")) {
			System.out.println("Enter Length:");
			Float length = scanner.nextFloat();
			System.out.println("Enter Breadth:");
			Float breadth = scanner.nextFloat();
			Rectangle rectangle = new Rectangle(shape, length, breadth);
			System.out.println(rectangle.calculateArea());
			rectangle = null;
		}
	}

}
