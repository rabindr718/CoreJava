
public class SelectionSort {
    public static void selectionSort(int[] arr) {
    	
    	
    	int []arr1 = {74,34,43,44,443,43,6};
    for(int i = 0;i<arr1.length;i++)
        {
            for(int j = i+1;j<arr1.length;j++)
            {
                int temp = 0;
                if(arr1[i]>arr1[j])
                {
                    temp = arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
    }   

}

