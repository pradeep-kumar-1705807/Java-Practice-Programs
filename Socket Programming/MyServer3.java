import java.net.*;  
import java.io.*;  

class ServerWrite implements Runnable
{
	ServerSocket ss=new ServerSocket(3333);  
    Socket s=ss.accept();  
	String str;
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
    ServerWrite(ServerSocket ss1, Socket so, DataOutputStream d) throws Exception
	{
		ss1=ss;
		s=so;
		d=dout;
	}		
	public void getLine(String line)throws Exception
	{
		str=line;
		
	}		
	public void run()
	{
		try
		{
		dout.writeUTF(str);  
        dout.flush();
		}
         catch(Exception e)

		 {
			 System.out.println("Fuck you");
		 }
	}
	public void end()throws Exception
	{
		dout.close();
		
	}
}


class MyServer3{  
public static void main(String args[])throws Exception{  
ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
ServerWrite w1=new ServerWrite(ss,s,dout);
Thread t1=new Thread(w1);  
String str="",str2="";  
while(!str.equals("stop")){  
str=din.readUTF();  
System.out.println("client says: "+str);  
str2=br.readLine();  
w1.getLine(str2);
t1.start(); 
}  
din.close();
  w1.end();
s.close();  
ss.close();  
}} 