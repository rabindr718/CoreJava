import java.util.Scanner;

interface clients {
	void input(); // public + abstract

	void output(); // public + abstract

}

public class Rabindra implements clients {

	String name;
	double sal;

	public void input() {

		Scanner r = new Scanner(System.in);
		System.out.println("Enter The Name");
		name = r.nextLine();
		System.out.println("Enter The Salary");
		sal = r.nextDouble();

	}

	public void output() {
		System.out.println("Name of Employee : " + name + " Salary " + sal);
	}

	public static void main(String[] args) {

		clients c = new Rabindra();
		c.input();
		c.output();
	}

}
