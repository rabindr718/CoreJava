package Practice.Rabindra.com;
public class printfactor {
public static void printFactorial(int n, int fact) {
		if (n == 0) 
		{
			System.out.println(fact);
			return;
		}
		fact =fact* n;
		printFactorial(n - 1, fact);
	}

	public static void main(String args[]) 
	{
		printFactorial(3, 1);
	}
}
