import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		int num=r.nextInt();
		
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i + " * "+ num +" : " +num*i);
		}
		
	}

}
