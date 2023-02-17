package Method.java;

import java.util.Scanner;

public class Method_With_Function {
	
	static int printSum(int Sum)
	{
		return 5+Sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the Value is : ");
	System.out.println(printSum(sc.nextInt())+" : This is Sum");

	}

}
