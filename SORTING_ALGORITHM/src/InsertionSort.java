
public class InsertionSort {
	

	    public static void insertionSort(int[] arr) {
	    	 for(int i = 0;i<arr.length-1;i++)
	       {
	           for(int j=i+1;j>0;j--)
	           {
	               if(arr[j-1]>arr[j])
	               {
	                   int temp = arr[j-1];
	                   arr[j-1]=arr[j];
	                   arr[j]=temp;
	               }
	           }
	       }
	    }

	}
