package Practice.Rabindra.com;

public class PrintFactorial {
	public static void printFibbo(int a, int b, int n)
	{
		if(n==0) {
			return;
		}
		int c=a+b;
		System.out.println(c);
		System.out.println("Method 1");
		printFibbo(b,c,n-1);
	}
public static void main(String[] args) {
		int a=0, b=1;
		System.out.println(a);
		System.out.println("Main 1");
		System.out.println(b);
		System.out.println("Main 2");
		
		int n=9;
		printFibbo(a,b, n-2);
	}

}
