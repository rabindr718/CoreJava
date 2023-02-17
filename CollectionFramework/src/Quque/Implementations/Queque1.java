package Quque.Implementations;
import java.util.LinkedList;
import java.util.Queue;
public class Queque1 {

	public static void main(String[] args) {
		Queue<Integer> quequelist=new LinkedList<>();
		quequelist.add(10);
		quequelist.add(20);
		quequelist.add(30);
		quequelist.add(40);
		quequelist.add(50);
		quequelist.add(60);
		quequelist.add(70);
		quequelist.add(80);
		quequelist.add(90);
		while(!quequelist.isEmpty())
		{
			System.out.println(quequelist.peek());
			quequelist.poll();
		}
	}
}
