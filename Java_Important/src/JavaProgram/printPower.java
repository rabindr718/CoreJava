package JavaProgram;

import java.util.Scanner;

public class printPower {

	public static void main(String[] args) {

		int n, p, result=1;
		
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		p=input.nextInt();
		for(int i=1; i<=p; i++)
		{
			result=n *result;
		}
		System.out.println("Your Value is : "+result);
	}

}
