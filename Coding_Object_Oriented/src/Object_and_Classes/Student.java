package Object_and_Classes;

public class Student {

	

		public String name;
		private final int rollNumber;
		static int numStudent;
		public Student(String name, int rollNumber)
		{
			this.name=name;
			this.rollNumber=rollNumber;
			numStudent++;
		}
	}


