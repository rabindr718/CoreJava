package StringCodingNinjas;

public class RowWise {

public class RowWiseSum {
	public class Solution {

		public static void rowWiseSum(int[][] arr) {
		    
	        if(arr.length == 0){
	            return ;
	        }else{
	            
	            int row = arr.length;
	            int cols = arr[0].length;
	            for(int i = 0; i < row; i++){
	                int sum = 0;
	                for(int j = 0; j < cols; j++){
	                    sum += arr[i][j];    
	                }
	                
	                System.out.print(sum +" ");    
	            }
	                    
	        }
	        
	        
					 
		}
	}

}

}
