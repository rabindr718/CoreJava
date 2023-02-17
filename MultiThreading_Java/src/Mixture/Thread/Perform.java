package Mixture.Thread;
class Calculation {
	public void Table1(int x) {
		for (int i = 1; i <=10; i++) {
			System.out.print(i * x+" ");
		}
		System.out.println();
	}

	public synchronized void Table2(int z) {
		for (int i = 1; i <=10; i++) {
			System.out.print(i * z+" ");
		}
		System.out.println();

	}

	public synchronized void  Table3(int y) {
		for (int i = 1; i <=10; i++) {
			System.out.print(i * y+" ");
		}
		System.out.println();

	}

}

class Rabindra extends Thread {
	Calculation c;

	Rabindra(Calculation c) {
		this.c = c;
	}

	public void run() {
		c.Table1(7);
		c.Table2(4);
		c.Table3(9);
	}
}

public class Perform {

	public static void main(String[] args) {
		Calculation object = new Calculation();
		Rabindra t1=new Rabindra(object);
		Rabindra t2=new Rabindra(object);
		Rabindra t3=new Rabindra(object);
		t1.start(); t2.start(); t3.start();

		}

}
