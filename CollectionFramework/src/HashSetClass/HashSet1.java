package HashSetClass;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet<String> str=new HashSet<String>();
		str.add("R");
		str.add("A");
		str.add("B");
		str.add("I");
		str.add("N");
		str.add("D");
		str.add("R");
		str.add("A");
		Iterator it=str.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	}

}
