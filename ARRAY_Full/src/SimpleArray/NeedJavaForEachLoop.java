package SimpleArray;

import java.util.Arrays;
import java.util.Collections;

public class NeedJavaForEachLoop {

	public static void main(String[] args) {

		Integer arr[]= {5,3,2,2,1,1,4,5,6,8,8,4,2,1,4,5,6,7,8,9};
		
		Arrays.sort(arr, Collections.reverseOrder());
		for(int output : arr)
		System.out.print(output +" ");
		
		
	}
}
