package StringCodingNinjas;
import java.util.Scanner;
public class ReverseEachWord {

		// Return the reversed string. No need to print
		public static String reverseEachWord(String input) {
			// Write your code here
	String reverseWord = "",result = "";
			int start = 0,j,end;
			for(int i= 0;i < input.length();i++) {
				if(input.charAt(i) == ' ') {
					end = i - 1;
					reverseWord = "";
					for(j = end;j >= start;j--) {
						reverseWord += input.charAt(j);
					}
					start  = i + 1;
					result = result + reverseWord + " ";
				}
			}
				reverseWord = "";
				for(j = input.length() - 1;j >= start;j--) {
					reverseWord += input.charAt(j);
				}
				result = result + reverseWord + " ";		
			return result;
		}

		public static void main(String[] args) {
			 Scanner s = new Scanner(System.in);
				String str = s.nextLine();
				String str1 = reverseEachWord(str);
				System.out.print(str1);
		

		}
	}
