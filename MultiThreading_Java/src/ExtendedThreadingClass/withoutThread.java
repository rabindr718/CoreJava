package ExtendedThreadingClass;

class thread1 extends Thread
{
	public void fun()
	{
		for(int i=0; i<4; i++) {
		System.out.println("Hello Rabindra");}
	}
}
public class withoutThread {

	public static void main(String[] args) {
		
		thread1 t1=new thread1();
		t1.fun();
		for(int i=0; i<5; i++) {
			System.out.println("Hello Main Method");}
	}

}
