package Practice.Rabindra.com;

public class printNumber {
	public static void printN(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		printN(n-1);
		
	}
	public static void main(String []args)
	{
		int n=9;
		printN(n);
	}
}
