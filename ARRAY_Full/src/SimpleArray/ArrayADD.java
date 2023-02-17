package SimpleArray;

import java.util.Scanner;

public class ArrayADD {

	public static void main(String[] args) {
		long sum=0;
		System.out.println("Enter the Size of Array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{ 
			System.out.print(arr[i]+" ");
			sum=arr[i]+sum;
		}
		System.out.println(sum);
		
	}

}
