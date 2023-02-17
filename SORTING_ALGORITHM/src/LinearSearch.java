
public class LinearSearch {
	  public static int linearSearch(int arr[], int x) {
	        int index=-1;
			for(int i =0;i<arr.length;i++)
	        {
	            if(x==arr[i])
	            {
	                index = i;
	            }
	        }
	        return index;
	    }
	}

