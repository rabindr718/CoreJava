package Assinment3;

class A {
	
	int i=0;
	void display() 
	{
		System.out.println(i);
	}

}

class B extends A
{

int j=0;
void display() {
	System.out.println(j);}
	
}public class Main{
	
	public static void main(String []args)
	{
		B obj1=new B();
		obj1.i=1;
		obj1.j=2;
		obj1.display();
		
	}
}
