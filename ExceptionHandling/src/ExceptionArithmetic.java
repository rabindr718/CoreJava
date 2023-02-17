
public class ExceptionArithmetic {

	public static void main(String[] args) {

		int x = 100;
		int y = 0;
		try {
			int z = x / y;
			System.out.println(z);
		} catch (Exception e) {
			System.out.println(e+"Cannot divide by Zero");
		}
	}

}
