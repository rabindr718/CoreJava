import java.util.Scanner;
public class Caluculator {
	public static void main(String[] args) {

		int num1, num2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int cal =sc.nextInt();
		if(cal==1) 
		{
			System.out.println("Addition  Value is : "+(num1+ num2));
		}
		else if(cal ==2) 
		{System.out.println("Substration value is"+ (num1-num2));}
		else if(cal==3) 
		{System.out.println("Multiply Value is : "+(num1*num2));}
		else if(cal==4) {
			System.out.println("Divide Value is : "+(num1/num2));
		}
		else {
			System.out.println("Modulas Value is : "+(num1%num2));
			
		}
	}

}
