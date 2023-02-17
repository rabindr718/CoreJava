
import java.util.Scanner;
public class Main {
	public static String StringChallenge(String str) {
		boolean flag = false;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.charAt(i) == str.charAt(i + 3)) {
				flag = true;
			}

		}
		if (flag == true) {
			return "true";
		} else {
			return "false";
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(StringChallenge(sc.nextLine()));

	}

}
