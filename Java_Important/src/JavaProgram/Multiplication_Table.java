package JavaProgram;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			//System.out.println(num+" * "+i+" = "+num*i);
			System.out.println(num*i);
		}
	}

}
