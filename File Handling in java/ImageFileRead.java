import java.io.*;
public class ImageFileRead
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fin=new FileInputStream("photo.jpg");
		FileOutputStream fout=new FileOutputStream("pradeep.jpg");
		int i;
	    while((i=fin.read())!=-1)
		{
		 fout.write(i);
		}
		fin.close();
		fout.close();
	}
} 