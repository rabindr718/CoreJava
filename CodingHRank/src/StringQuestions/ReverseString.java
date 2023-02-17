package StringQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		
		String R=new StringBuilder(A).reverse().toString();
		if(A.equals(R))
		{
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
