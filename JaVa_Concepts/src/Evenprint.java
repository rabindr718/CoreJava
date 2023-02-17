import java.util.Scanner;

public class Evenprint {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int input =sc.nextInt();
		
		if(input%2 == 0) 
		{
			System.out.println("Even " + input);
		}
		else 
		{
			System.out.println("odd " +input);
		}
	}

}
