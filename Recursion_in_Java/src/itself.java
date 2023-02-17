import java.util.Scanner;

public class itself {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x =sc.nextInt();
		
		itself r =new itself();
		r.sum(x);
		
	}
	int sum(int x) {
		if(x>0) {
			return x + sum(x-1);
		}
		
		else {
			return 0;
		}
	}

}
