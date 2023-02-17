import java.util.Scanner;

public class WithoutRecursion {
	
	static long factorial(int num) {
		long fact =1;
		while(num>0) 
			fact *= num--;
			return fact;
			}
		public static void main(String []args) {
			
			Scanner sc= new Scanner(System.in);
//		    String y = sc.next();
//	        System.out.println("Enter the Number" + y);

			int n =sc.nextInt();
			System.out.print("Factorial of Number : ");
			System.out.println(WithoutRecursion.factorial(n));
	}

}
