package PractICe;

public class BuubleSort {

	public static void main(String[] args) {

		int[]arr= {63,44,22,11,4,5,3,2};
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]==arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
	}

}
