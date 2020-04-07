import java.net.*;  
import java.io.*;  
class ClientSend{  
public static void main(String args[])throws Exception{  
Socket s=new Socket("192.168.225.44",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
FileInputStream fin=new FileInputStream("Hello.txt");
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="";
int i;
while((i=fin.read())!=-1)
	{  
		i=fin.read();
		str=Integer.toString(i); 
		dout.writeUTF(str);  
		//dout.flush();  
	}
	dout.close();
	s.close();  
}
} 