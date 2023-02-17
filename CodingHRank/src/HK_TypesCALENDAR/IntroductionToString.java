package HK_TypesCALENDAR;

import java.util.Scanner;

public class IntroductionToString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		System.out.println(A.length() + B.length());

		int compare = A.compareTo(B);
		if (compare > 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		String Q=A.substring(0,1).toUpperCase()+A.substring(1)+' '+B.substring(0,1).toUpperCase()+B.substring(1);
		System.out.println(Q);

	}

}
