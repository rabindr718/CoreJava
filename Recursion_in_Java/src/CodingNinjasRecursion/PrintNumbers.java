package CodingNinjasRecursion;

public class PrintNumbers {

		public static void print(int n){
			if(n == 0)
				return;
			
	        print(n - 1);
			System.out.print(n+" ");
			
		}

	}
