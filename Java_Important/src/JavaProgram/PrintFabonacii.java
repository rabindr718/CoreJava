package JavaProgram;

import java.util.Scanner;

public class PrintFabonacii {

	public static void main(String[] args) {

		int term, a=0, b=1, c;
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		for(int i=1; i<=term; i++)
		{
			System.out.print(a+" ");
			c=a+b;
			//System.out.println(c +" im c");
			a=b;
			//System.out.println(a +"im a");
			b=c;
			//System.out.println(b+" im b");
		}
	}

}
