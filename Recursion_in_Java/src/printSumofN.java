public class printSumofN {
	public static void printSum(int i, int n, int sum)
	{
		if(n==i)
		{
			sum=sum+i;
			System.out.print(sum);
			return;
		}
		sum=sum+i;
		printSum(i+1,n,sum);
		return;
	}
	public static void main(String[]args)
	{
		printSum(1,5,0);
	}
}