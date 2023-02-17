import java.util.Scanner;

public class Fibonacci {
	
	
	public static void main(String[] args) {
		int intial=0, end = 1, term,result;
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		
		for(int i=1; i<=term; i++)
		{
			System.out.print(end + " ");
			
			result=intial+end;
			intial=end;
			end=result;
		}
	}
}
		
		



