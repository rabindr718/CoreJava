package PRACTICE.JAVA;

import java.util.Scanner;

public class CompareWith {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		String A=sc.next();
		String B=sc.next();
		
		int Q=A.compareTo(B);
		System.out.println(Q);
	}

}
