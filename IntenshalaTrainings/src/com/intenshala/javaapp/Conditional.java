package com.intenshala.javaapp;

public class Conditional {

	public static void main(String[] args) {

		boolean isSecular=false;
		
		
//		Using The If Condition
		
		String messege;
		if (isSecular) {
			
			
			messege ="India is Secular State";
		}	
			else {
				messege ="India is not Secular State";
		
		}
		System.out.println(messege);
		
		//Using the Ternary Operators
		
		String msg =isSecular? "India is Secular State" : "India is not Secular State";
		System.out.println(msg);
	}

}
