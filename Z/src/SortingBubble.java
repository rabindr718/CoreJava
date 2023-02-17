import java.util.Scanner;
public class SortingBubble {
	public static void printArr(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size=input.nextInt();
		int arr[]=new int[size];
		System.out.println(" Enter the Elements : ");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int arrResult: arr)
		{
			for(int i=0;i<arr.length-1; i++)
			{
				for(int j=0; j<arr.length-i-1; j++)
				{
					if(arr[j]>arr[j+1])
					{
						int temp=arr[j+1];
						arr[j=1]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		printArr(arr);
	}
}
