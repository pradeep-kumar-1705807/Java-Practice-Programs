import java.net.Socket;
import java.io.*;
public class ExampleSocket
{
	public static void main(String[] arg) throws Exception
	{
		int port =2222;   
		Socket s1=new Socket("localhost",port);
		String str="Pradeep Kumar";
		OutputStreamWriter os=new OutputStreamWriter(s1.getOutputStream());
		PrintWriter out=new PrintWriter(os);
		os.write(str); 
		os.flush();
		
	}
}