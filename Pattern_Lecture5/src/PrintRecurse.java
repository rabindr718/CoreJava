

public class PrintRecurse {
	
	public static int increaser(int n)
	{
		if(n==0)
		{
			return 1;
		}
		System.out.println(n);
		increaser(n-1);
		return 1;
		
	}

	public static void main(String[] args) {
		int n=100;

		increaser(n);
	}

}
