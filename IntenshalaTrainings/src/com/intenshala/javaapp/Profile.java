package com.intenshala.javaapp;

import java.util.Scanner;


public class Profile {

	public static void main(String[] args) {
		String Name; 
		String bloodgroup;
		int age;
		String Group;
		String RED, BLUE, YELLOW;
		Scanner pf = new Scanner(System.in);

		System.out.println("Enter your Name");
		Name =pf.nextLine();
	
		System.out.println("Enter Blood Group");
		bloodgroup =pf.nextLine();
	
		System.out.println("Enter The Age");
		age =pf.nextInt();
		
	System.out.println("Name : "+Name);
	System.out.println("Age : "+ age);
	System.out.println("Blood Group : "+bloodgroup);
	
	
    if(age >=20) {
	System.out.println("Your group is RED");
	}
	else if(age>=15) {
		System.out.println("Your group is BLUE");
	}
	else if (age>10){
		System.out.println("Your group is YELLOW");
			}
		}
	}
