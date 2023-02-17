package Calculator;
import java.util.Scanner;

public class CalculatoTax1 {
	public static long tax;
	private static void CalculateTax(String names, long income)
	{
		
		if(income<=300000)
		{
			tax=income*20/100;
		}
		else if(income<=10000) {
			tax=income*20/100;
		}else
		{
			tax=0;
		}
	}
	public static void main(String[] args) {
		System.out.println("Tax Calculator App");
		System.out.println("---Welcome---");

		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int count=sc.nextInt();
		String[] names=new String[count];
		long[] income=new long[count];
		for(int i=0; i<count; i++)
		{
			names[i]=sc.next();
			income[i]=sc.nextLong();
		}
		for(int i=0; i<count; i++)
		{
		CalculateTax(names[i], income[i]);
		}
		System.out.println(names + tax);
	}

}
