package TwoDimensionalArray;

public class Two_ADD {

	public static void main(String[] args) {
		int sum=0;
		int arr[][]= {
				{2,3,4,5,8},
				{4,6,7,8,9},
				{3,5,6,9,1},
				{5,7,8,4,3}
			 };
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
				sum=arr[i][j]+sum;
				
			}
//			System.out.println();
			
		}
		System.out.println("\n"+sum);

	}

}
