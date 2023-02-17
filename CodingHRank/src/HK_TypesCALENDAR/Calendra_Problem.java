package HK_TypesCALENDAR;
import java.util.Calendar;

public class Calendra_Problem {

	public static void main(String[] args) {

		Calendar calendra =Calendar.getInstance();
		System.out.println("Your Current TIME is : " + calendra.getTime());
		System.out.println("Your Current DATE is : " + calendra.get(Calendar.DATE));
		System.out.println("Your Current YEAR is : " + calendra.get(Calendar.YEAR));
		System.out.println("The current date is : " + calendra.getTime());  
		   calendra.add(Calendar.DATE, -15);  
		   System.out.println("15 days ago: " + calendra.getTime());  
		   calendra.add(Calendar.MONTH, 4);  
		   System.out.println("4 months later: " + calendra.getTime());  
		   calendra.add(Calendar.YEAR, 2);  
		   System.out.println("2 years later: " + calendra.getTime());  
		   int maximum = calendra.getMinimum(Calendar.DAY_OF_WEEK);  
		   System.out.println("Minimum number of days in week: " + maximum);  
		   maximum = calendra.getMinimum(Calendar.WEEK_OF_YEAR);  
		   System.out.println("Minimum number of weeks in year: " + maximum);  

	}

}
