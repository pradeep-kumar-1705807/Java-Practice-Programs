import java.net.*;
import java.util.*;
import java.io.*;
class ExampleServer
{
	static public void serverRead() throws Exception
	{
		ServerSocket ss=new ServerSocket(4444);
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		String str1="",str2="";
		str1=din.readUTF();
		System.out.println("Client [:] "+str1);
		din.close();
		s.close();
		ss.close();
		
	}
	static public void serverWrite()throws Exception
	{
		ServerSocket ss=new ServerSocket(4444);
		Socket s=ss.accept();
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		String  str2="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Server [:] ");
		str2=sc.nextLine();
		dout.writeUTF(str2);
		dout.flush();
	
		dout.close();
		s.close();
		ss.close();
		
	}
	public static void main(String args[]) throws Exception
	{
		
			serverWrite();
			serverRead();
		
	}
}