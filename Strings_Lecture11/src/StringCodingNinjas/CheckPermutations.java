package StringCodingNinjas;
import java.util.Arrays;
public class CheckPermutations {

		
		public static boolean isPermutation(String str1, String str2) {
			int len1 =str1.length();
			int len2=str2.length();
			int freq []=new int [256];
			int ref []=new int [256];
			
			if (len1!=len2) {
				return false;
			}
			
			
			for(int i=0;i<len1;i++) {
				int var= (int) str1.charAt(i);
				freq[var]++;
			}
				
				for(int j=0;j<len2;j++) {
					int var=(int) str2.charAt(j);
					freq[var]--;
				}
					
				
				if(Arrays.equals(ref, freq)) {
					return true;
				}
				    else {
					return false;
				  }
				
		}
	}
