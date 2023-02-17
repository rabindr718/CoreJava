
public class BinarySearch {

	     public static int binarySearch(int[] arr, int x) {
	    	//Your code goes here
	        int start=0;
	        int end=arr.length-1;
	        int pos = -1;
	        while(start<=end)
	        {
	            int mid=(start+end)/2;
	            if(arr[mid]==x)
	            {
	                pos = mid;
	                break;
	            }
	            else if(arr[mid]<x)
	            {
	                start = mid+1;
	            }
	            else
	            {
	                end = mid-1;
	            }
	        }
	         return pos;
	    }
	}

