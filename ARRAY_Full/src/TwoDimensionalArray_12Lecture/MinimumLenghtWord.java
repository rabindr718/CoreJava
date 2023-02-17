package TwoDimensionalArray_12Lecture;

public class MinimumLenghtWord {

	// Write your code here
public class Solution {

public static String minLengthWord(String input){
    int spaceIndex=0;
	int startIndex=0;
	int endIndex=0;
	int minLength=Integer.MAX_VALUE;
	for(int i=0;i<=input.length();i++) {
		
		if(i==input.length() || input.charAt(i)==' ' ) {
			int length= i-spaceIndex;
			if(minLength > length) {
				minLength=length;
				startIndex=spaceIndex;
				endIndex=i;
			}
			spaceIndex=i+1;
		}
		
		
	}
	return input.substring(startIndex,endIndex);
	
	// Write your code here

}
}




}
