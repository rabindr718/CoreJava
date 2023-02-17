
public class Swapp {

	public static void main(String[] args) {

		int y=100;
		int z=300;
		y=y^z;
		z=y^z;
		y=y^z;
		System.out.println("Y : "+ y);
		System.out.println("Z : "+ z);
		int a=50;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println();
		System.out.println("A : "+ a);
		System.out.println("B : "+ b);


		
	}

}
