package HashSetClass;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set);
		if(set.contains(2))
		{
			System.out.println("Yes Conatains :");
		}
		if(!set.contains(6))
		{
			System.out.println("This is Not Contains :");
		}
		Iterator it= set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() +" ");
		}
		
	}

}
