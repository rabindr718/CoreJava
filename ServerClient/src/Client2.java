	import java.io.*;
	import java.util.Scanner;
	import java.net.*;
	public class Client2 {
	public static void main(String args[]) throws Exception{
		Socket s = new Socket("192.168.43.1",7778);
		PrintStream ps = new PrintStream(s.getOutputStream());
		Scanner kbstr = new Scanner(System.in);
		Scanner socketstr = new Scanner(s.getInputStream());
		String kbinput,socketInput;
		while(true)
		{
			kbinput = kbstr.nextLine();
			ps.println(kbinput);
			if(kbinput.equals("exit"))
			{
				break;
			}
			socketInput = socketstr.nextLine();
			System.out.println("Message from server - "+socketInput);
			
		}
	}
	}

