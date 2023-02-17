import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the String Value");
		StringBuilder sb=new StringBuilder(input.nextLine());
		
		sb.reverse();
		System.out.println(sb);
	}

}
