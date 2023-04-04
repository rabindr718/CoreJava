class shape1{
	public void area() {
		System.out.println("display area");
	}
}

class Triangle1 extends shape1{
	public void area(int l, int h) {
		System.out.println(1/2*l*h);
	}
}

class EqualateralTriangle extends Triangle1{
	public void area(int l,int h) {
		System.out.println(1 / 2 * l * h);
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		

	}
}
