package CodingNinjasRecursion;

public class CheckNumberinArray {

	    public static boolean checkNumber(int input[], int x) {
	        return checkNumber(input,x,0);
	    }
	    private static boolean checkNumber(int input[],int x,int startIndex){
	        if(startIndex==input.length)
	            return false;
	        if(input[startIndex]==x)
	            return true;
	        return checkNumber(input,x,startIndex+1);
	        }
	}
