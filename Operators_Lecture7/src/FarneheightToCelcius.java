import java.util.Scanner;
public class FarneheightToCelcius {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	         int S = sc.nextInt();
	          int E = sc.nextInt();
	        	int W = sc.nextInt();
	        	while(S<=E)
	            {
	                int cel = ((S-32)*5)/9;
	                System.out.print(S+" ");
	                System.out.println(cel);
	                S= S+W;
	            }
			
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/

			
		}

	}
