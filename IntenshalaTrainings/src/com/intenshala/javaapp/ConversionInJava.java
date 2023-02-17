package com.intenshala.javaapp;

public class ConversionInJava {

	public static void main(String[] args) {
		
		
		//Implicit Conversion in Java

		int radius = 400;
		double  newRadius =radius;
		System.out.println(newRadius);
		
		
		//Explicit Conversion in Java

		double newdiameter = 50.0;
		int oldName = (int) newdiameter;
 		System.out.println(oldName);
	}
}

