import java.util.Scanner;
public class DyanamicArray
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Size of Array");
		
		int size =sc.nextInt();
		int Number[]=new int[size];
		System.out.println("Enter the Value of " +size+ " Elements");
		
		for(int i=0; i<Number.length; i++)
		{
			Number[i]= sc.nextInt();
		}
		System.out.println("Your Entered Value are ");
		for(int i=0; i<Number.length; i++) 
		{
			System.out.print(Number[i] + " ");
		}
	}
}