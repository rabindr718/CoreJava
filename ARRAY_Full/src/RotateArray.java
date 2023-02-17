
public class RotateArray {
	    public static void rotate(int[] arr, int d) {
	        int[] arr1=new int[d];
	        int count =0;
	    	for(int i =0;i<d;i++)
	        {
	            arr1[i]=arr[i];
	        }
	        for(int i=0;i<arr.length;i++)
	        {
	            if(i<arr.length-d)
	            {
	               arr[i]=arr[i+d];
	            }
	            else
	            {
	                arr[i]=arr1[count];
	                count++;
	            }
	        }
	    }

	}
