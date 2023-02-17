import java.util.Scanner;

public class FactorialUsing_While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number");
		int n = sc.nextInt();

		int fact = 1;
		int num = n;
		int i = 1;

		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println(num + fact);
	}

}
