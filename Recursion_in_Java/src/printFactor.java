public class printFactor {
	
	public static int  printFactor(int n)
	{
		if(n==0|| n==1)
		{
			return 1;
		}
		int factorPerform=printFactor(n-1);
		int donefact=n*factorPerform;
		return donefact;
	}

	public static void main(String[] args) {

		int n=5;
		int anser=printFactor(n);
		System.out.print(anser);
	}

}
