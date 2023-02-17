
public class EasyCalculatePower {

	public static int powerCalculate(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (x == 1) {
			return 0;
		}
		if (n % 2 == 0) {
			return powerCalculate(x, n / 2) * powerCalculate(x, n / 2);
		} else {
			return powerCalculate(x, n / 2) * powerCalculate(x, n / 2) * x;
		}
	}

	public static void main(String[] args) {

		int x = 2, n = 5;
		int out = powerCalculate(x, n);
		System.out.println(out);

	}

}
