import java.net.*;
import java.io.*;
import java.util.*;
class MyClient
{
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("198.168.137.112",6666);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		String msg;
		System.out.println("Enter the text to send to the server");
		msg=(String)sc.nextLine();
		dout.writeUTF(msg);
		dout.flush();
		dout.close();
		s.close();
	}
}