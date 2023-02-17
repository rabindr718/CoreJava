package Mixture.Thread;
class Table
{
	public void printTable(int x) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i * x);
		}
}
}
class Thread1 extends Thread
	{
		Table t;
			Thread1(Table t)
		{
			this.t=t;
		}
			public void run()
		{
			t.printTable(5);
		}
	}
class Thread2 extends Thread
{
	Table t;
	Thread2(Table t)
{
	this.t=t;
}
	public void run()
{
	t.printTable(7);
}
	
}

public class MyThread1
{
	public static void main(String[]args)
	{
		Table object=new Table();
		Thread1 t1=new Thread1(object);
		Thread2 t2=new Thread2(object);
		t1.start();
		t2.start();
		
	}
}

