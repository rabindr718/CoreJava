package Sorting2;
public class InsertionSort_Java {
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = { 9, 4, 5, 2, 5, 6, 7, 8, 2, 1, 3, 57, 6 };
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
		printArray(arr);
	}
}
