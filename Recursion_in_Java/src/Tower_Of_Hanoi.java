
public class Tower_Of_Hanoi {
	public static void Tower_Of_Hanoi(int n, String source, String Helper, String Destination) {
		if (n == 1) {
			System.out.println("Transfer disk " + n + " from " + source + " to " + Destination);
			return;
		}
		Tower_Of_Hanoi(n - 1, source, Destination, Helper);
		System.out.println("Transfer disk " + n +  " from " + source + " to " + Destination);
		Tower_Of_Hanoi(n - 1, Helper, source, Destination);

	}

	public static void main(String[] args) {

		int n = 3;

		Tower_Of_Hanoi(n, " source", "Helper", "Destination");
	}

}
