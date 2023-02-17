
public class test {
	
	void div(int a, int b) {
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
			int c=a/b;
			System.out.println(c);
		}
	}
	

	public static void main(String[] args) {;
	
	test t = new test();
	t.div(20, 9 );
	
		// TODO Auto-generated method stub

	}

}
