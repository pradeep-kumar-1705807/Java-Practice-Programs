import java.io.*;
public class FileExample4
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("G:\\data1.txt");
		String s="Java Tutorials By Pradeep Kumar ";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
	}
}