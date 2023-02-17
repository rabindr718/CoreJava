package TwoDimensionalArray_12Lecture;

public class LeadersInArray {
	public class Solution {

		public static void leaders(int[] input) {
	        for(int i=0;i<input.length;i++) {
				boolean allSmaller=true;
				for(int j=i+1;j<input.length;j++) {
					if(input[i] < input[j]) {
						allSmaller=false;
						break;
					}
				}
				if(allSmaller) {
					System.out.print(input[i]+" ");
				}
			}
	        
			/* Your class should be named Solution 
			 * Don't write main(). 
			 * Don't read input, it is passed as function argument. 
			 * Print output and don't return it. 
			 * Taking input is handled automatically. 
			 */
			
		}
		
	}
}
