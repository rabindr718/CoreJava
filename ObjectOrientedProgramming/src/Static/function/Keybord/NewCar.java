package Static.function.Keybord;

// This is Based on  Static Functions

class Test{
	static int a=10;
	static int b;
	static void fun() {
		b = a * 4;
	}
}
public class NewCar {

	public static void main(String[] args) {

		Test t =new Test();
		t.fun();
		System.out.println(t.a + t.b);
	}

}
