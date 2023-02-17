package JavaProgram;
import java.util.Scanner;

public class PrintNNumbersSum {

	public static void main(String[] args) {

		int n, sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0; i<=n; i++)
		{
			sum=sum+i;
		}
		System.out.print(sum+" ");
	}

}
