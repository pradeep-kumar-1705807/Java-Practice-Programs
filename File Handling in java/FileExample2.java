import java.io.*;
public class FileExample2
{
	public static void main(String[] args) throws IOException
	{
		 FileOutputStream fout=new FileOutputStream("G:\\testfile.txt");
		 fout.write(65);
		 fout.close();
		 System.out.println("Sucessful");
	
	}
}