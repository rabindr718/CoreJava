
public class Swapping {

	public static void main(String[] args) {

		int a=10, b=15;
		
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		
//		System.out.print("Values of A : "+a+" \n");
//		System.out.println("Values of B : "+b);
		
//		int t=a;       //This is Seconds Types
//		a=b;
//		b=t;
//		System.out.print("Values of A : "+a+" \n");
//		System.out.print("Values of B : "+b);
		
		b=a+b-(a=b);
		System.out.println("A is : "+a);
		System.out.println("B is : "+b);
//		
		
		
	}

}
