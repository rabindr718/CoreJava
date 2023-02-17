public class CalculatePowerof_N {
	
	public static int powerCalculate(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		int process=powerCalculate(x, n-1);
		int output=x*process;
		return output;
	}
	public static void main(String[] args)
	{
		int x=2, n=5;
		int x1=powerCalculate(x,n);
		System.out.println(x1);
	}
}
