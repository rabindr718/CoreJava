package SimpleArray;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {

//		int arr[]= {4,5,7,8,21,3,5};
		Integer arr[]={4,5,7,8,21,3,5};
		
		Arrays.sort(arr, Collections.reverseOrder()); // This is Based on QuickSort
//		Arrays.parallelSort(arr);    /// This Based on Odd-Even MergeSort
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
	}

}
