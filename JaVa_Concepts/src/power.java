import java.util.Scanner;
public class power {

	public static void main(String [] args)
	{
		int base, power, Results=1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Base of Number");
		base=sc.nextInt();
		
		System.out.println("Enter The power of Number");
		power=sc.nextInt();
		
		for(int i=1; i<=power; i++) 
		{
			Results=Results*base;
			System.out.println(Results + " ");
		}
		
	}
		
}
