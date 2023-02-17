package Calculator;

import java.util.Scanner;

public class CalculatorUsing_Java {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int result;
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int operation = input.nextInt();

		if (operation == 1) {
			result = num1 + num2;
			System.out.println("Addition is : " + result);
		} else if (operation == 2) {
			result = num1 - num2;
			System.out.println("Substration  is : " + result);
		} else if (operation == 3) {
			result = num1 / num2;
			System.out.println("Divide is : " + result);
		} else {
			result = num1 * num2;
			System.out.println("Multiplication is : " + result);
		}
	}

}
