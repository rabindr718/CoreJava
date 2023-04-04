class shape {
	public void area() {
		System.out.println("display area");
	}
}

// Hierarchy Inheritance


class Triangle extends shape {
	public void area(int l, int h) {
		System.out.println(1 / 2 * l * h);
	}
}

class Circle extends shape{
	public void area(int r) {
		System.out.println((3.13)*r*r);
	}
}

public class Hierarcy_Inheritance {

	public static void main(String[] args) {
		

	}
}
