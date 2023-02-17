import java.util.Scanner;
public class SumofEven {
	public static void main(String[] args) {
 
		int number, i, sum=0;
		Scanner sc=new Scanner(System.in);
		
		number=sc.nextInt();
		if(number%2==0)
		{
			for(i=0; i<=number; i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum of Even "+sum);
		}
		else
		{
			for(i=1; i<=number; i++) 
			{
				sum=sum+i;
			}
			System.out.println("Sum of Odd Numbers "+sum);
		}
		
	}
}
