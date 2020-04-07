import java.net.*;
import java.util.*;
import java.io.*;
public class ExampleClient
{
	static void clientWrite()throws Exception
	{
		Socket s=new Socket("localhost",4444);
		DataOutputStream dout =new DataOutputStream(s.getOutputStream());
		Scanner sc=new Scanner(System.in);
		String msg;
		System.out.print("Client [:]");
		msg=sc.nextLine();
		dout.writeUTF(msg);
		dout.flush();
		dout.close();
		s.close();
	}
	static void clientRead() throws Exception
	{
		
		Socket s=new Socket("localhost",4444);
		DataInputStream din =new DataInputStream(s.getInputStream());
		String str=" ";
		str=din.readUTF();
		System.out.println("Server [:] "+str);
		din.close();
		s.close();
	}
	public static void main(String args[]) throws Exception
	{
			clientRead();
			clientWrite();
	
	}
}