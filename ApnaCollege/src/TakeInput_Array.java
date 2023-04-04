import java.util.*;
public class TakeInput_Array {

	public static void main(String[] args) {
//take input from the user
	Scanner sc = new Scanner(System.in);

	int sharma =sc.nextInt();
	//This is for declare length of array
	int numbers[]=new int[sharma];
	for(int i=0; i<sharma; i++) {
		
		numbers[i]=sc.nextInt();
	}
	
	for(int i = 0; i <=sharma; i++) {
		System.out.println(numbers[i]);
		sc.close();
	}
   }
}

