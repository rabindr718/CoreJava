import java.util.Scanner;
public class StringFormatter {
	public static void main(String[] args) {
		String str = "maeT naidnI olleH";
		Scanner sc=new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		for (int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		sb.reverse();
		System.out.println();
		System.out.println();
		System.out.print(sb);
	}

}
