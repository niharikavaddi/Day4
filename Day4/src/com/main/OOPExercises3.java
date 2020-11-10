package com.main;

import com.service.A;
import com.service.B;
import com.service.C;

/**
 * Show the output of the following applications.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class OOPExercises3 {

	static int a = 555;

	public static void main(String[] args) {

		A objA = new A();

		B objB1 = new B();

		A objB2 = new B();

		C objC1 = new C();

		B objC2 = new C();

		A objC3 = new C();

		objA.display();

		objB1.display();

		objB2.display();

		objC1.display();

		objC2.display();

		objC3.display();
	}

}