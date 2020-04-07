import java.io.*;
public class Example
{
	public static void main(String[] args) throws IOException
	{
		FileReader fin=new FileReader("file.txt");
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}