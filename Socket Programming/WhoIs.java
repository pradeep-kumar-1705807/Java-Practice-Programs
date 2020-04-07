import java.net.*;
import java.io.*;

class WhoIs
{
	static int c;
	public static void main(String args[]) throws Exception
	{
		Socket s=new Socket("whois.internic.net",43);
		InputStream in=s.getInputStream();
		OutputStream ou=s.getOutputStream();
		
		String str= (args.length==0?"OraclePressBook.com":args[0]) +"\n";
		
		byte buf[]=str.getBytes();
		ou.write(buf);
		while((c=in.read())!=-1)
		{
			System.out.print((char)c);
		}
		s.close();
	}
}