package TwoDimensionalArray_12Lecture;

public class LargestRoworColumn {
	public class Solution {

		public static void findLargest(int mat[][]){
			
	       int row = mat.length;
	        
	        if(row == 0){
	            System.out.println("row "+ 0 +" "+Integer.MIN_VALUE);
	            return;
	        }
	        
	        
	        int col = mat[0].length;
	        int maxRowSum = Integer.MIN_VALUE;
			int rowNum =  Integer.MIN_VALUE;
			
			
			for(int i = 0; i < row; i++) {
				int sum = 0;
				for(int j = 0; j < col; j++) {
					sum+= mat[i][j];
				}
				if(maxRowSum < sum) {
					maxRowSum = sum;
					rowNum = i;
				}
			}
	        
	        
			int maxColSum = Integer.MIN_VALUE;
			int colNum = Integer.MIN_VALUE;
			
			for(int i = 0; i < col; i++) {
				int sum = 0;
				for(int j = 0; j < row; j++) {
					sum+= mat[j][i];
				}
				if(maxColSum < sum) {
					maxColSum = sum;
					colNum = i;
				}
			}
			
			if(maxRowSum >= maxColSum ) {
				System.out.println("row " + rowNum + " " + maxRowSum);
			}
			else {
				System.out.println("column " + colNum + " " + maxColSum);
			}
			
		}
		
		

	}
}
