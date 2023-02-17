package StringAQuestions;

import java.util.Scanner;

public class PrintA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		if (count % 2 == 0) {
			System.out.println("Strong");

		} else {
			System.out.println("Weak");
		}
	}

}
