import java.util.Scanner;
public class Factorial_using_iteration {
public static void main(String[] args) {
	int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Factor Value");
		int number=sc.nextInt();
		for( int i=1; i<=number; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factor of Given Value is : "+fact);
	}

}
