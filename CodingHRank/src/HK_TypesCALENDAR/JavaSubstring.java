package HK_TypesCALENDAR;

import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		
		int Start=sc.nextInt();
		int End =sc.nextInt();
		
		System.out.println(A.substring(Start,End));
		
	}

}
