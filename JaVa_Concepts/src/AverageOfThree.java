import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s =new Scanner(System.in);
   int a =s.nextInt();
   int b =s.nextInt();
   int c=s.nextInt();
   System.out.println("This is Average of Three Numbers= "+(a+b+c%3));
	}

}
