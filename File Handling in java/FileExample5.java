import java.io.*;
import java.util.*;
public class FileExample5
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		FileOutputStream fout=new FileOutputStream("G:\\data2.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s=new String();
		System.out.println("Enter the String :-");
		s=sc.nextLine();
		byte b[]=s.getBytes();
		bout.write(b);
		//bout.flush();
		bout.close();
		fout.close();
		System.out.println("sucess");
	}
}