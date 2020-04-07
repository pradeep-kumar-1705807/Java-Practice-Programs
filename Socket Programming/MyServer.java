import java.io.*;
import java.util.*;
import java.net.*;
class MyServer
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(6666);
		Socket s=ss.accept();//establish a connection
		DataInputStream d1=new DataInputStream(s.getInputStream());
		DataOutputStream d2=new DataOutputStream(s.getOutputStream());
		d2.writeUTF("Welcome to The Server");
		d2.flush();
		
		
		String str=(String)d1.readUTF();
		System.out.println("Message :-"+str);
		
		
		//ss.close();
		
		
	}
}