package PractICe;
public class SelectionSort {
	public static void printAr(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
public static void main(String[] args) {

		int arr[]= {4,6,7,83,1,3,5,8,9};
		for(int i=0; i<arr.length-1; i++)
		{
			int smallest=i;
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					int temp=smallest;
					smallest=arr[j];
					arr[j]=temp;
				}
			}
		}
		printAr(arr);
	}

}
