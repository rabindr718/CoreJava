import java.util.Scanner;
public class FactorialCalculate {
	
	public static void factorialSum(int n) {
		
		int factorial =1;
		
		for(int i=n; i>=1; i--) {
			
			factorial =factorial * i;
		}
		System.out.println(factorial);
		return;
		}
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		factorialSum(n);
		}
}