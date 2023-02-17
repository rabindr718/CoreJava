import java.util.Scanner;
public class factorial_using_Recursion {
	public static int calculatefac(int n) 
	{
		if(n==1 || n==0) 
		{
			return 1;
		}
		int factorResult=calculatefac(n-1);
		int factorValue=n*factorResult;
		return factorValue;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int ans=calculatefac(n);
		System.out.println("Factorial of Entered : "+ans);
		}
	}
