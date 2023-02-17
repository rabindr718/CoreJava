public class Fibo1 {
	public void fibo(int a, int b, int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(a+" ");
		fibo(b,a+b,n-1);
		
	}

	public static void main(String[] args) {
		
		Fibo1 f=new Fibo1();
		f.fibo(0,1,9);

		
	}

}
