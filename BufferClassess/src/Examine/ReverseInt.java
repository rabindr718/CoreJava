package Examine;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		StringBuilder sbl=new StringBuilder();
		sbl.append(number);
		sbl.reverse();
		System.out.println(sbl);
	}

}
