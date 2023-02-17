import java.util.Scanner;

class Implemention_Of_Method {
	int a,b; int add, sub, multi, divide, remain;
	
	public static void main(String[] args) {
		
		Implemention_Of_Method ref=new Implemention_Of_Method(); //This is Constructor in Java Same as
		//Constructor Used to call by class name
		ref.input();
		ref.process();
		ref.output();
	}
// This is Used To Take input from User
		void input()
		{
			
			Scanner r =new Scanner(System.in);
			System.out.println("Enter Two Numbers");
			
			a= r.nextInt();
			b= r.nextInt();
			
			//Here all process done 
		}
		void process()
		{
			add = a+b;
			sub=a-b;
			multi= a*b;
			divide =a/b;
			remain = a%b;
		}
		//Here Print the All Process as Output
		void output()
		{
			System.out.println("This is Addition of :" + (a+b));
			System.out.println("This is Subtraction of " + (a-b));
			System.out.println("This is Mutliptication of Two : " + a*b);
			System.out.println("This is Divide of Two : " + a/b);
			System.out.println("This is Remainder of Two : " + a%b);
			
		}
	}

