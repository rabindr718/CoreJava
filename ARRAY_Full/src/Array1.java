
public class Array1 {

	public static void main(String[] args)
	{

		 int[] marks = new int[7];
		 
		 try {
		
		 marks[1] = 101;
		 marks[2] = 102;
		 marks[3] = 103;
		 marks[4] = 104;
		 marks[5] = 105;
		
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		 }
		 catch(Exception e) 
		 {
			 System.out.println("Code Executed");
		 }
		
	}

}
