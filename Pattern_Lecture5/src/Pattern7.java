
	import java.util.Scanner;
	public class Pattern7 {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n =s.nextInt();
			int i = 1;
			int counter=1;
			while(i<=n) {
			int j=1;
			int startingNumber = i;
			while(j<=i) {
				System.out.print(counter);
				counter++;
				j++;
				
			}
			System.out.println();
			i++;
			}
			
			
		}

	}
