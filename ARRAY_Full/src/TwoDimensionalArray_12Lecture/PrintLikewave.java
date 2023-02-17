package TwoDimensionalArray_12Lecture;
public class PrintLikewave {
	public class Solution {
	    
		public static void wavePrint(int mat[][]){	
		    if(mat.length == 0){
		        return;
		    }
		    
		    int row = mat.length;
		    int col = mat[0].length;
		    
		    for(int j = 0; j < col; j++) {
		        
		        if( j % 2 == 0){
		            for(int i = 0; i < row; i++) {
				System.out.print(mat[i][j] + " ");			
				}  
		            
		        }else{
		            for(int i = row - 1; i >= 0; i--) {
				System.out.print(mat[i][j] + " ");   
				}  
		        }
		            
		    }
		     
		    	
		  }

		}

}
