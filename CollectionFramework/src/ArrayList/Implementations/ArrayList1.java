package ArrayList.Implementations;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		while (true) {
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			displayMenu();
			while (true) {

				if (choice == 1) {
					System.out.println("Enter the elements");
					list.add(input.nextInt());
				} else if (choice == 2) {
					System.out.println("Elements are Removed");
					int elementToRemove=input.nextInt();
					if(list.contains(elementToRemove)) {
						list.remove(Integer.valueOf(elementToRemove));
						System.out.println("Itmens Remove");
					}else
					{
						System.out.println("Elements  Not Found");
					}
					
				} else if (choice == 3) {
					System.out.println("This Elements are Entered by You");
					System.out.println(list);
				} else if (choice == 4) {
					System.out.println("Good Bye");
				}
			}
		}
	}

	private static void displayMenu() {

		//Scanner input = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("1. Add Elements");
		System.out.println("2. Remove Elements");
		System.out.println("3. Display Elements");
		System.out.println("4. Exit From the Loop");
		System.out.println();
	}

}
