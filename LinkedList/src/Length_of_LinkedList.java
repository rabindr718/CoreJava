	import java.io.*;
	import java.util.LinkedList;
	  
	public class Length_of_LinkedList  {
	    public static void main(String args[])
	    {
	  
	        // Creating an empty LinkedList
	        LinkedList<String> list = new LinkedList<String>();
	  
	        // Using add() method to add elements in the list
	        list.add("Rabindra");
	        list.add("Steven Smith");
	        list.add("Ziya Siddique");
	        list.add("AB de Villiers");
	        list.add("David Miller");
	        list.add("Ravindra Jadeja");
	        list.add("David Warner");
	        list.add("Chris Gayle");
	        list.add("King Kohli");
	  
	        // Displaying the linkedlist
	        System.out.println("LinkedList:" + list);
	          
	        // Displaying the size of the list
	        System.out.println("The size of the linked list is: " + list.size());
	    }
	}
