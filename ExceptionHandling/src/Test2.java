import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int age =sc.nextInt();
		vote(age);
	}

		public static void vote(int age) {
			if(age<18) {
				System.out.println("You are Not Eligible for Vote");
			}
			else {
				System.out.println("You are Eligible Vote");
				}
		}
	}


