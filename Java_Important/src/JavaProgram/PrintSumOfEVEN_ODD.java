package JavaProgram;
import java.util.Scanner;

public class PrintSumOfEVEN_ODD {
	
	
	
		public static void main(String[]args)
		{
			Scanner input=new Scanner(System.in);

			int n=input.nextInt();
			int sum=0;


			if(n%2==1)
			{
				for(int i=1; i<=n;i=i+2)
				{
					sum=sum+i;
				}
				System.out.println(sum + " This is Odd");
			}
			else
			{
				for(int i=0;i<=n; i=i+2)
				{
					sum=sum+i;
				}
				System.out.println(sum + " This is Even");
				
			}
		}
	}

