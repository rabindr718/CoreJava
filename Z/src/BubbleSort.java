
public class BubbleSort {
	public static void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		int arr[]= {33,44,55,66,77,88,11};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		printArray(arr);
	}

}
