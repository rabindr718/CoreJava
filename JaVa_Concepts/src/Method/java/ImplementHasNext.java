package Method.java;

import java.util.Scanner;

public class ImplementHasNext {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		while(input.hasNext())
		{
			System.out.println(input.hasNext());
			System.out.println(input.next());
			System.out.println(input.hasNext());
		}
		
	}

}
