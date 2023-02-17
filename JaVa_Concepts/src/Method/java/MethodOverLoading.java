package Method.java;

import java.util.Scanner;

public class MethodOverLoading {
	
	public static int printName(int Salary)
	{
		return Salary;
	}
	public static String printName( String value)
	{
		return value;
	}


	public static void main(String[] args) {
		
	
		System.out.println(printName(1000)+ " "+printName(71346+" Rabindra"));
		
	}

}
