package com.intenshala.javaapp;

import java.util.Scanner;

public class GROUP {

	public static void main(String[] args) {
		Scanner pf=new Scanner(System.in);
		int age;
		age =pf.nextInt();
		
		String RED, YELLOW, BLUE;
		
		if (age >=20) {
		System.out.println("RED");
		} else if (age >=15) {
		System.out.println("BLUE");
		} else {
		System.out.println("YELLOW");
			}
	}
}
