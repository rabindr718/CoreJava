import java.util.Scanner;

public class IFELSE_ladder_with_Switch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		switch (grade) {
		case 'A':
			System.out.println("You are Excellent");

		case 'B':
			System.out.println("This is Very Good Score");
		case 'C':
			System.out.println("This is Good Score");
		case 'D':
			System.out.println("Your are Passed , You need More Work");
		case 'F':
			System.out.println("You are Failled in this Exam You need Work Hard and Passed");

		}

	}

}
