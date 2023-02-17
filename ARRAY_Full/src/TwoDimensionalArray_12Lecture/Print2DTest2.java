package TwoDimensionalArray_12Lecture;

public class Print2DTest2 {
	public class solution {
		public static void print2DArray(int input[][]) {
	        for(int i=0;i<input.length;i++) {
				
				for(int k=0;k<(input.length-i);k++) {
					for(int j=0;j<input[i].length;j++) {
						System.out.print(input[i][j]+" ");
					}
					System.out.println();
					
				}
				
			}
			// Write your code here

		}
	}
}
