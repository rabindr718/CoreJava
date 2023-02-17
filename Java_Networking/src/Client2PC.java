import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class Client2PC {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Socket s= new Socket("192.168.43.11",8881);
		
		PrintStream printSocket = new PrintStream(s.getOutputStream());
		
//		Line no.15 and 16 we can add MultithreadingConcept
		Scanner kbScanner =new Scanner(System.in);
		Scanner socketScanner = new Scanner (s.getInputStream());
		
		
		String serverStr, kbstr;
		while(true)
		{
			kbstr= kbScanner.nextLine();
			printSocket.println(kbstr);
			if(kbstr.equals("exit"))
				break;
			serverStr = socketScanner.nextLine();
			System.out.println("Messege from Server-- "+ serverStr);
		}
		

	}

}
