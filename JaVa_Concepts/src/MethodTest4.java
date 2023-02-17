
class MethodTest4 {
	void sum(int a, int b) {
		System.out.println("a method invoked");

	}

	void sum(long a, int b) {
		System.out.println("b method invoked");

	}

	public static void main(String args[]) {
		MethodTest4 obj = new MethodTest4();
		obj.sum(20, 20);// now ambiguity
	}

}
