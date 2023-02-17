package DoWhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int sum = 0;
		do {
			System.out.println("Enter the Number : ");
			number = sc.nextInt();

			sum = sum + number;

		} while (number != 0);
		System.out.println("The Sum is : " + sum);
	}

}
