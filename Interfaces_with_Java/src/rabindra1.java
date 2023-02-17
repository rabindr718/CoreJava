import java.util.Scanner;
interface employee {
	void user_input();
	void user_output();
}
public class rabindra1 implements employee {
	String name; int salary;
		public void user_input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of Emlpoyee");
		name = sc.nextLine();
		System.out.println("Enter the Salary of Employee");
		salary = sc.nextInt();

	}
	    public void user_output() 
	    {
	    	System.out.println(name + " -----> "+"$"+salary);
		}
	    public static void main(String[] args) {
		employee rks = new rabindra1();
		rks.user_input();
		rks.user_output();
	}
}