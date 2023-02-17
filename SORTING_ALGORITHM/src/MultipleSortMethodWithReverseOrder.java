import java.util.Arrays;
import java.util.Collections;

public class MultipleSortMethodWithReverseOrder {

	public static void main(String[] args) {

		int arr[]= {64,2424,2,23,4,3,32,2,1,3,4,5,7,8,9};
		Integer a[]= {64,2424,2,23,4,3,32,2,1,3,4,5,7,8,9};

		System.out.println("Arrays elements before Sorting : " + Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("Arrays elements before Sorting : " + Arrays.toString(arr));
		Arrays.sort(arr);
		Arrays.sort(a ,Collections.reverseOrder());
		for(int x: a) {
		System.out.print(x+" ");}
	}

}
