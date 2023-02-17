package com.intenshala.javaapp;

	/* Click on the checkbox for Add Custom Input and then write the input there before running the program */
	import java.util.Scanner;
	public class Main {

		public static void main(String[] args) {
		
		
			String name;
		    int age;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your name");
		name =sc.nextLine();
		
		
		System.out.println("Enter you age");
		age =sc.nextInt();
		
		
		System.out.println("Your name is "+ name);
		System.out.println("Your age is "+ age);
		sc.close();
		}
	}
