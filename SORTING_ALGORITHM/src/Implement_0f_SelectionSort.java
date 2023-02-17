public class Implement_0f_SelectionSort {
    public static void printArray(int []arr){
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[]args)
    {
        int arr[]={9,2,3,4,6,7,3,4,5,8,9,54,3,3,2,2,2,45,6,56,1,56453,5,23,4};
        for(int i=0; i<arr.length-1; i++)
        {
            int smallest=i;
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    int temp=arr[smallest];
                    arr[smallest]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        printArray(arr);
    }
    
}
