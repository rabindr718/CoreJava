package ArrayL;
import java.util.ArrayList;
import java.util.Collections;

public class JavaArray {
	public static void main(String[] args) {

		ArrayList<Integer> integer=new ArrayList<>();
		
		Collections.addAll(integer,12,11,13,45,16,17,18,19);
		ArrayList<String> s=new ArrayList<>();
		Collections.addAll(s,"Mumbai", "Hyderabad", "Chennai", "Delhi");
		s.add(0,"SIWAN");
		System.out.println(s+" ");
		s.remove(2);
		System.out.println(s+" ");
		//s.remove(3);
		System.out.println(integer);
	}

}
