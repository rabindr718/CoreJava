package While_loop;
import java.util.Scanner;

public class TotalSalary {
	
	public class Main {
		
		public static void main(String[] args) {
			// Write your code here
	       Scanner sc = new Scanner(System.in);
	        double basic_salary = sc.nextInt();
	        String str = sc.next();
	        char c = str.charAt(0);
	        double hra = (basic_salary*20)/100;
	        double da = (basic_salary*50)/100;
	        double allow = 0;
	        double pf = (basic_salary*11)/100;
	        if(c=='A')
	        {
	            allow = 1700;
	        }
	        else if(c == 'B')
	        {
	            allow = 1500;
	        }
	        else
	        {
	            allow = 1300;
	        }
	        double totalSalary = basic_salary+hra+da+allow-pf;
	        System.out.println(Math.round(totalSalary));
		}
	}

}
