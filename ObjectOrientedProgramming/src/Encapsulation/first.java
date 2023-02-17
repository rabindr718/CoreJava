package Encapsulation;

class second {

	private int wing;

	public  void setValue(int x) {
		 wing = x;
	}

	public  int getValue() {
		return ++wing;
	}

}

public class first {

	public static void main(String[] args) {

		second sc = new second();
		sc.setValue(100);
		System.out.println(sc.getValue());

	}
}
