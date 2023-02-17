package While_loop;
import java.util.Scanner;
public class findcharactercase {
	
	    
	    public static void main(String[] args) {
	        // Write your code here
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
