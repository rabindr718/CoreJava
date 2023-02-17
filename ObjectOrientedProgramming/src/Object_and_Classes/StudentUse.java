package Object_and_Classes;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//This is Class Name of Student another in this Package
		Student s1=new Student();
		//Set Name & Roll Number
		s1.name="Rabindra";
		s1.rollNumber=137;
//		s1.rollNumber ="131";

		Student s2=new Student();
		
		s2.name="Steven Smith";
		s2.rollNumber=160;
		
		
		
		System.out.println(s1.name);
		
		System.out.println(s1.rollNumber);
		
		System.out.println(s2.name);
		System.out.println(s2.rollNumber);
		
		

	}

}
