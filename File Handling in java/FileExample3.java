import java.io.*;
public class FileExample3
{
	public static void main(String srgs[]) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("g:\\data1.txt");
		int i;
		String s1="Pradeep Kumar Knows Java ";
		char ch[]=s1.toCharArray();
		for(i=0;i<s1.length();i++)
		{
			fout.write(ch[i]);
			
		}
		fout.close();
		
	}
}