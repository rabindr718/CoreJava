package JavaProgram;
import java.util.Scanner;

public class EvenPrint {

	public static void main(String[] args) {

		int n;
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		for(int i=0; i<=n;i=i+2)
		{
			System.out.print(i+" ");
		}
	}

}
