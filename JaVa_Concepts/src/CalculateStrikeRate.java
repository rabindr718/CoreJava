import java.util.Scanner;
public class CalculateStrikeRate {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		{
			System.out.println("Enter the Name of Batsman :");
			String name=sc.nextLine();
			
			System.out.println("Enter the Run : ");
			
			int run=sc.nextInt();
			
			
			System.out.println("Enter the Ball : ");
		    int ball=sc.nextInt();
			int strike=(run/ball)*100;
			System.out.println("The Strike Rate of " +name+" is : " +strike);
		}
	}

}
