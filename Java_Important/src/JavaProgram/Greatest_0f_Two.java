package JavaProgram;

import java.util.Scanner;

public class Greatest_0f_Two {
	
	public static void main(String []args)
	{
		Scanner input=new Scanner(System.in);
		
		int a=input.nextInt();
		int b=input.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" : A This is Greater");
		}
		else
		{
			System.out.println(b +" : B This is Greater");
		}
	}

}
