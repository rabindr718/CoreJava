package ArrayList.Implementations;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(108);
		list.add(786);
		list.add(100);
		list.add(987);
		System.out.println(list);
		list.set(0,100);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		list.add(1009);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		//Used to Print Specific Number
		System.out.println(list.get(3));
		
		
		
		
	}

}
