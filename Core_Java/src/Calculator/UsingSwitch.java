package Calculator;
import java.util.Scanner;
public class UsingSwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result;
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int operation = input.nextInt();
		switch (operation) {
		case 1:
			result = num1 + num2;
			System.out.println(result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println(result);
			break;
		case 3:
			result = num1 / num2;
			System.out.println(result);
			break;
		case 4:
			result = num1 * num2;
			System.out.println(result);
			break;
		}
	}
}
