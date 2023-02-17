package Mixture.Thread;

public class MyAnnotherThread  extends Thread{
	
	public void run()
	{
		for(int i=5; i>1; i--)
		{
			System.out.println("Hello Marwadi "+i);
		}
	}

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		MyAnnotherThread t3=new MyAnnotherThread();
		Thread t2=new Thread(t1);
		t2.start();
		t3.start();
	}

}
