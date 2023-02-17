import java.util.Scanner;
public class CheckCaseAlphabet {

	public static void main(String[] args) {
		
		    Scanner s = new Scanner(System.in);
		    
		    char c = s.next().charAt(0);
		    
		    if(Character.isUpperCase(c))
		    	
		        System.out.println("1");
		    
		    else if(Character.isLowerCase(c))
		    	
		        System.out.println("0");
		    else
		        System.out.println("-1");
		    }
		
	}
