import java.net.*;  
import java.io.*;  
class ServerRecieve{  
public static void main(String args[])throws Exception,IOException{  
ServerSocket ss=new ServerSocket(3333);  
Socket s=ss.accept();  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
FileOutputStream fout=new FileOutputStream("RecievedText.txt"); 
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
int i=0;
String str="";
while(i!=-1)
{  
str=din.readUTF();
i=Integer.parseInt(str);   
fout.write(i);  
//dout.flush();  
}  
fout.close();
din.close();  
s.close();  
ss.close();  
}} 