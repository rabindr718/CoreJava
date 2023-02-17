package STACK.Implementations;
import java.util.*;

public class StackClass {

	public static void main(String[] args) {

		Stack<Integer> s=new Stack<>();
		s.push(9); //first inserted at Button
		s.push(8);
		s.push(7);
		s.push(6);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);// Push operation is Used to Insert elements in Stack
		s.push(1); //Last Inserted at Top due to Last in First Out

		System.out.println(s);  //print the entire elements
		while(!s.isEmpty())// Check Whether Stack is empty if not then print
		{
			System.out.println(s.peek()); //This is Used to Fetch elements using stack
			s.pop();// This is Used to Remove Elements from Stack
		}
		
	}

}
