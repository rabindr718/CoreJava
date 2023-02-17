package JavaProgram;
import java.util.Scanner;

public class PrintOdd {

	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		// This is For Odd Numbers
		System.out.print("Odd Numbers : ");
		for (int i = 1; i <= n; i = i + 2) {
			System.out.print(i + " ");
		}
		n = input.nextInt();

		// This is For Even Numbers
		System.out.print("Even Numbers :");
		for (int i = 0; i <= n; i = i + 2) {
			System.out.print(i + " ");
		}
	}

}
