import java.io.*;
public class ExampleBufferedReader
{
	public static void main(String args[]) throws IOException
	{
		FileReader f1=new FileReader("Example.java");
		BufferedReader b1=new BufferedReader(f1);
		int i;
		while((i=b1.read())!=-1)
		{
			System.out.print((char)i);
		}
		b1.close();
	}
}