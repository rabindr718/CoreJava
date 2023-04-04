
public class Recursion1 {
	
	public static void printNum(int n) {
		
		if(n==10) {   //Here we give ==0 and 
			return;
		}
		
		System.out.println(n);
		printNum(n+1); //Here we give n-1;
	}

	public static void main(String[] args) {


		int n= 1; // Here we Give 5 then we can reverse this till 5;
		
		printNum(n);
	}

}
