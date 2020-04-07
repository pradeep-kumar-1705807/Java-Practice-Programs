import java.io.*;
public class FileReadExample
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin=new FileInputStream("g:\\data1.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
		System.out.print((char)i);
		}
		fin.close();
	}
}