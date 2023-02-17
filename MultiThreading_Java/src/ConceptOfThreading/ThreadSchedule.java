package ConceptOfThreading;

public class ThreadSchedule extends Thread {
	
	public void run()
	{
		String n=Thread.currentThread().getName();
		for(int i=1; i<=3; i++)
		{
			System.out.println(n);
		}
	}
	

	public static void main(String[] args) {
		
		ThreadSchedule t1=new ThreadSchedule();
		ThreadSchedule t2=new ThreadSchedule();
		ThreadSchedule t3=new ThreadSchedule();
		
		t1.setName("I am 1");
		t2.setName("I am 2");
		t3.setName("I am 3");
		t1.start();
		t2.start();
		t3.start();
		

	}

}
