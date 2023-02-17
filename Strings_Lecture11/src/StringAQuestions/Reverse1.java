package StringAQuestions;

import java.util.Scanner;

public class Reverse1 {

	public static void main(String[] args) {

		int l;
		Scanner sc=new Scanner(System.in);
		
		
		String str=sc.nextLine();
		
		l=str.length();
		for(int i=l-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
	}

}
