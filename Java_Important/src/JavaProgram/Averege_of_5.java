package JavaProgram;

import java.util.Scanner;

public class Averege_of_5 {
	
	public static void main(String []args)
	{
		int a,b,c,d,e;
		
		Scanner input=new Scanner(System.in);
		
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		e=input.nextInt();
		
		int sum=(a+b+c+d+e)/5;
		System.out.println(sum);
		
	}

}
