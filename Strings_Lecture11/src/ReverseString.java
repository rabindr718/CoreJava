import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the String Value");

		StringBuffer sb=new StringBuffer(input.nextLine());
		
		sb.reverse();
		System.out.println(sb);
	}

}
