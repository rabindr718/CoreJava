package JavaProgram;

import java.util.Scanner;

public class PrintPowerX {

	public static void main(String[] args) {

		int power, base, result=1;
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		power=sc.nextInt();
		for(int i=1; i<=power; i++)
		{
			result=base*result;
		}
		System.out.println(result);
		
	}

}
