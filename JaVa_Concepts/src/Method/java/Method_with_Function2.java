package Method.java;

import java.util.Scanner;

public class Method_with_Function2 {

	static int checkage(int age) {
		if (age > 18) {
			System.out.println("You are Eligible for Vote");
		} else
			System.out.println("You are Not eligible");
		return age;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the AGe for Check : ");

		checkage(sc.nextInt());

	}

}
