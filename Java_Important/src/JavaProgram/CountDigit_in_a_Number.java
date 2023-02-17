package JavaProgram;

import java.util.Scanner;

public class CountDigit_in_a_Number {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		int n, count=0;
		n=input.nextInt();
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);

	}

}
