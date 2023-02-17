import java.util.Scanner;
public class DyanamicA
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		
		int size=sc.nextInt();
		int Cost[]=new int[size];
		
		for(int i=0; i<Cost.length; i++)
		{
			Cost[i]=sc.nextInt();
		}
		for(int i=0; i<Cost.length; i++)
		{
			System.out.print(Cost[i]+ " ");
		}

	}


}