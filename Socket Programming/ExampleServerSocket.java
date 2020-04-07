import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ExampleServerSocket
{
	public static void main(String args[])throws Exception
	{
		System.out.println("Server is Started");
		ServerSocket ss=new ServerSocket(2222);
		System.out.println("Server is Waiting");
		Socket s=ss.accept();
		System.out.println("Client Connected ");
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str =br.readLine();
		System.out.println("client Date :- "+str);
	
	}
}