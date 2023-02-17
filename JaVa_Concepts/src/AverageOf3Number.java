import java.util.Scanner;
public class AverageOf3Number {
 //Average of 3 number
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		int c =s.nextInt();
		int sum = a+b+c;
		int avg = sum/3;
		System.out.println(avg);

	}

}
