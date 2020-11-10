package com.main;

import com.service.Aclass;

/**
 * The following Java applications contain errors. Point out the statement(s)
 * that contain errors. Explain what each of the errors is, and how it can be
 * fixed.
 * 
 * @author Lakshmi Neeharika
 *
 */
public class OOPExercises1 {

	public static void main(String[] args) {

		Aclass objA = new Aclass();

		System.out.println("in main(): ");

		System.out.println("objA.a = " + objA.getA());// as variable a is private, we have to use get method here, if it
														// is
														// null it throws a null pointer execption

		objA.setA(222);// have to use set method to initialise variables

	}

}