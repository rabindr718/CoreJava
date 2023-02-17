package Reverse.Java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String r=sc.nextLine();
		String r2="";
		int i,l;
		l=r.length();
		for(i=l-1; i>=0; i--)
		{
			r2=r2+r.charAt(i);
		}
		System.out.println(r2);
		
	}
	
}
