package TwoDimensionalArray;

public class Implement_2D_Array {
	public static void main(String[] args) {

		int arr[][]= {
						{2,3,4,5,8},
						{4,6,7,8,9},
						{3,5,6,9,1},
						{5,7,8,4,3}
					 };
		
		for(int row=0; row<arr.length; row++)
		{
			for(int column=0; column<arr[row].length;column++)
			{
				System.out.print(arr[row][column]+" ");
			}
			System.out.println();
		}
	}

}
