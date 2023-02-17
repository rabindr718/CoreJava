
public class NlogCalculate {

	public static int CalculateFactor(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (x == 1) {
			return 0;
		}
		if (n % 2 == 0) {
			return CalculateFactor(x, n / 2) * CalculateFactor(x, n / 2);
		} else {
			return CalculateFactor(x, n / 2) * CalculateFactor(x, n / 2) * x;
		}
	}

	public static void main(String[] args) {

		int j = CalculateFactor(1, 2);
		System.out.println(j);

	}

}
