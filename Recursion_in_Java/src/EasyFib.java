
public class EasyFib {
	
	public static void fibonacciSeries(int a, int b, int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(a);
		fibonacciSeries(b, a+b, n-1);
		
	}
	public static void main(String []args) 
	{
		fibonacciSeries(0,1,9);
		
	}

}
